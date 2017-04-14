package com.ws.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by sivag on 13/4/17.
 */
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id ;

    @NotNull
    String name;

    @NotNull
    int marks;

    @NotNull
    char grade;


}
