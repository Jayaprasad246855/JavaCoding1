package com.example.voters.serviceimpl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.voters.connection.JdbcConnection;
import com.example.voters.model.Voter;
import com.example.voters.repository.VoterRepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class VoterServiceImpl {

    @Autowired
    VoterRepo repo;

    public List<Voter> addVoter(List<Voter> request) {
        try{
            repo.saveAll(request);
        }catch (Exception e){
            log.error("exception occured while adding voters",e);
            request.get(0).setMessage("error while adding voters");
            return request;
        }
        log.info("successfully added");
        return request;
    }

    public String check(int voterId) {
        try{
            Voter voter=repo.findById(voterId).get();
            if(voter.getAge()>18) {
                return "is a major";
            }
            else {
                return "is a minor";
            }
        }catch (Exception e){
            log.error("exception occured while checking voters",e);
            return "error occured while checking voter";
        }
    }

    public List<Voter> jdbc(int age) throws SQLException {
        Connection connection= JdbcConnection.getConnection();
        String sql="select * from voters where age>?";
        List<Voter> response=new ArrayList<>();
        Voter voter=null;
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1,age);
            ResultSet resultSet= statement.executeQuery();
            while (resultSet.next())
            {
                voter=new Voter();
                voter.setVoterId(resultSet.getInt("voter_id"));
                voter.setVoterName(resultSet.getString("voter_name"));
                voter.setAge(resultSet.getInt("age"));
                response.add(voter);
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }
        return response;
    }

    public List<Voter> jdbcPost(List<Voter> request) throws SQLException {
        Connection connection=JdbcConnection.getConnection();
        String sql="INSERT INTO voters (voter_id,voter_name,age) values(?,?,?)";
        try{
            PreparedStatement statement= connection.prepareStatement(sql);
            for(Voter temp:request)
            {
                statement.setInt(1,temp.getVoterId());
                statement.setString(2,temp.getVoterName());
                statement.setInt(3,temp.getAge());
                statement.addBatch();
            }
            int [] result=statement.executeBatch();
            if(result[0]>0)
            {
                return request;
            }
            else {
                request.get(0).setMessage("failure");
                return request;
            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            connection.close();
        }
        return null;
    }
}
