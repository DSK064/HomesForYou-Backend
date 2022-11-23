package com.BackendSecurity.models;

import lombok.Data;

import javax.persistence.*;

@Data//getters and setters are generated
@Entity
@Table(name = "HomeDetails")
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private  String homeName;
    @Column(nullable = false)
    private  String type;
    @Column(nullable = false)
    private double homePrice;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private int homeAge;

    @Lob
    @Column(nullable = false)
    private String homeImage;
}
