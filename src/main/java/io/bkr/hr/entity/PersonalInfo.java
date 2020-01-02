package io.bkr.hr.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class PersonalInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  long id;

    @Column(name="firstNameKor", nullable = false)
    private  String firstNameKor;

    @Column(name="lastNameKor", nullable = false)
    private  String lastNameKor;

    @Column(name = "firstNameEng", nullable = false)
    private String firstNameEng;

    @Column(name = "lastNameEng", nullable = false)
    private String last_name_Eng;

    @Column(name = "idDOB", nullable = false)
    private String idDOB;

    @Column(name = "idCertNum", nullable = false)
    private String idCertNum;

    @Column(name = "isTeenager", nullable = false)
    private boolean isTeenager;

    @Column(name = "employeeNumber", nullable = false)
    private String employeeNumber;

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "phoneNumber1", nullable = false)
    private String phoneNumber1;

    @Column(name = "phoneNumber2", nullable = false)
    private String phoneNumber2;

    @Column(name = "phoneNumber3", nullable = false)
    private String phoneNumber3;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "emergencyContact1", nullable = false)
    private String emergencyContact1;

    @Column(name = "emergencyContact2", nullable = false)
    private String emergencyContact2;

    @Column(name = "emergencyContact3", nullable = false)
    private String emergencyContact3;

    @Column(name = "relation", nullable = false)
    private String relation;

    @Column(name = "isDisabled", nullable = false)
    private boolean isDisabled;

    @Column(name = "welfareCardNumber", nullable = false)
    private String welfareCardNumber;

    @Column(name = "disabilityRating", nullable = false)
    private DisabilityRating disabilityRating;

    @Column(name = "typesOfDisorders", nullable = false)
    private TypesOfDisorders typesOfDisorders;



}