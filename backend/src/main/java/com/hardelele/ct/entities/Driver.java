package com.hardelele.ct.entities;

import javax.persistence.*;

@Entity
@Table(name = "drivers")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

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

    @Column(name = "birth")
    private String birth;

    @Column(name = "passportScanUrl")
    private String passportScanUrl;

    public Driver() {
    }

    public Driver(String firstName, String secondName, String patronymicName,
                  String nationality, long passportSeries, long passportNumber,
                  String birth, String passportScanUrl) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymicName = patronymicName;
        this.nationality = nationality;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.birth = birth;
        this.passportScanUrl = passportScanUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public long getPassportSeries() {
        return passportSeries;
    }

    public void setPassportSeries(long passportSeries) {
        this.passportSeries = passportSeries;
    }

    public long getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(long passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getPassportScanUrl() {
        return passportScanUrl;
    }

    public void setPassportScanUrl(String passportScanUrl) {
        this.passportScanUrl = passportScanUrl;
    }
}
