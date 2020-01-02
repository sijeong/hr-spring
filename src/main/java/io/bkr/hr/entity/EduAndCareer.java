package io.bkr.hr.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class EduAndCareer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "finalEducation",nullable = false)
    private String finalEducation;

    @Column(name = "isGraduated", nullable = false)
    private boolean isGraduated;

    @Column(name = "nameOfSchool", nullable = false)
    private String nameOfSchool;

    @Column(name = "major", nullable = false)
    private String major;

    @Column(name = "hasCareer", nullable = false)
    private boolean hasCareer;

    @Column(name = "nameOfCompany", nullable = true)
    private String nameOfCompany;

    @Column(name = "position", nullable = true)
    private String position;

    @Column(name = "workPeriod", nullable = true)
    private String workPeriod;
}
