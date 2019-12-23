package com.hardelele.ct.models;

import javax.persistence.*;

@Entity
@Table(name = "trips")
public class TripModel {

    @Basic
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Basic
    @Column(name = "departure")
    private String departure;

    @Basic
    @Column(name = "destination")
    private String destination;

    @Basic
    @Column(name = "driverId")
    private int driverId;

    @Basic
    @Column(name = "carId")
    private int carId;

    @Basic
    @Column(name = "driverPrice")
    private double driverPrice;

    @Basic
    @Column(name = "startDate")
    private String startDate;

    @Basic
    @Column(name = "endDate")
    private String endDate;

    public TripModel() {
    }

    public TripModel(
            String departure,
            String destination,
            int driverId,
            int carId,
            double driverPrice,
            String startDate,
            String endDate
    ) {
        this.departure = departure;
        this.destination = destination;
        this.driverId = driverId;
        this.carId = carId;
        this.driverPrice = driverPrice;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public double getDriverPrice() {
        return driverPrice;
    }

    public void setDriverPrice(double driverPrice) {
        this.driverPrice = driverPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
