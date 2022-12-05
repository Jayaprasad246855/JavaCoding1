package com.example.voters.model;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name ="voters")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Voter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "voter_id")
    private int voterId;
    @Column(name = "voter_name")
    private String voterName;
    @Column(name = "age")
    private int age;

    @Transient
    private String message;

}
