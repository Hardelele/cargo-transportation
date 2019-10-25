package com.hardelele.ct.models;

import javax.persistence.*;

@Entity
@Table(name = "trips")
public class TripEntity {

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
    private long driverId;

    @Basic
    @Column(name = "carId")
    private long carId;

    @Basic
    @Column(name = "driverPrice")
    private double driverPrice;

    @Basic
    @Column(name = "startDate")
    private String startDate;

    @Basic
    @Column(name = "endDate")
    private String endDate;

    public TripEntity() {
    }

    public TripEntity(
            String departure,
            String destination,
            long driverId,
            long carId,
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

    public long getDriverId() {
        return driverId;
    }

    public void setDriverId(long driverId) {
        this.driverId = driverId;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
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
