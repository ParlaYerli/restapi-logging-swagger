package com.example.logswagger.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
}
