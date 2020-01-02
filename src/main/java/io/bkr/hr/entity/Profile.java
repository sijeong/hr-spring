package io.bkr.hr.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "wideArea", nullable = false)
    private String wideArea;
    @Column(name = "smallArea", nullable = false)
    private String smallArea;
    @Column(name = "store", nullable = false)
    private String store;
    @Column(name = "position", nullable = false)
    private String position;
    @Column(name = "joinDate", nullable = false)
    private Date joinDate;
    @Column(name = "resignationDate", nullable = false)
    private Date resignationDate;

}
