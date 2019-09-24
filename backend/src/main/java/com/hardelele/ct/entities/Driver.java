package com.hardelele.ct.entities;

import javax.persistence.*;

@Entity
@Table(name = "staff")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "position")
    private String position;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "secondName")
    private String secondName;

    @Column(name = "patronymicName")
    private String patronymicName;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "passportSeries")
    private long passportSeries;

    @Column(name = "passportNumber")
    private long passportNumber;

    @Column(name = "dateOfBirth")
    private String dateOfBirth;

    @Column(name = "passportScanUrl")
    private String passportScanUrl;

}
