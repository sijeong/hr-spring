package io.bkr.hr.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    @Column(name="first_name", nullable = false)
    private  String firstName;

    @Column(name="last_name", nullable = false)
    private  String lastName;

    private int age;
}