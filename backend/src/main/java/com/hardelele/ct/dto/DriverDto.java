package com.hardelele.ct.dto;

import java.util.Objects;

public class DriverDto {

    private int id;
    private String firstName;
    private String secondName;
    private String patronymicName;
    private String nationality;
    private long passportSeries;
    private long passportNumber;
    private String birth;
    private String passportScanUrl;

    public DriverDto(int id, String firstName, String secondName, String patronymicName, String nationality, long passportSeries, long passportNumber, String birth, String passportScanUrl) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymicName = patronymicName;
        this.nationality = nationality;
        this.passportSeries = passportSeries;
        this.passportNumber = passportNumber;
        this.birth = birth;
        this.passportScanUrl = passportScanUrl;
    }

    @Override
    public String toString() {
        return "DriverDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                ", nationality='" + nationality + '\'' +
                ", passportSeries=" + passportSeries +
                ", passportNumber=" + passportNumber +
                ", birth='" + birth + '\'' +
                ", passportScanUrl='" + passportScanUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverDto driverDto = (DriverDto) o;
        return id == driverDto.id &&
                passportSeries == driverDto.passportSeries &&
                passportNumber == driverDto.passportNumber &&
                Objects.equals(firstName, driverDto.firstName) &&
                Objects.equals(secondName, driverDto.secondName) &&
                Objects.equals(patronymicName, driverDto.patronymicName) &&
                Objects.equals(nationality, driverDto.nationality) &&
                Objects.equals(birth, driverDto.birth) &&
                Objects.equals(passportScanUrl, driverDto.passportScanUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, secondName, patronymicName, nationality, passportSeries, passportNumber, birth, passportScanUrl);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public DriverDto() {
    }
}
