package com.example.voters.controller;

import com.example.voters.model.Voter;
import com.example.voters.serviceimpl.VoterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
public class VoterController {

    @Autowired
    VoterServiceImpl service;

    @GetMapping("/")
    public String home()
    {
        return "Welcome!";
    }

    @PostMapping("/addVoter")
    public List<Voter> addVoter(@RequestBody List<Voter> request)
    {
        return  service.addVoter(request);
    }

    @GetMapping("/check")
    public String check(@RequestParam int voterId)
    {
        return service.check(voterId);
    }

    @GetMapping("/jdbc")
    public List<Voter> jdbc(@RequestParam int age) throws SQLException {
        return service.jdbc(age);
    }

    @PostMapping("/jdbcPost")
    public List<Voter> jdbcPost(@RequestBody List<Voter> request) throws SQLException {
        return service.jdbcPost(request);
    }



}
