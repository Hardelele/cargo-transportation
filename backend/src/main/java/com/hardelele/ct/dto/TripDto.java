package com.hardelele.ct.dto;

import java.util.Objects;

public class TripDto {

    private long id;
    private String departure;
    private String destination;
    private int driverId;
    private int carId;
    private double driverPrice;
    private String startDate;
    private String endDate;

    public TripDto() {
    }

    public TripDto(long id, String departure, String destination, int driverId, int carId, double driverPrice,
                   String startDate, String endDate) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TripDto tripDto = (TripDto) o;
        return id == tripDto.id &&
                driverId == tripDto.driverId &&
                carId == tripDto.carId &&
                Double.compare(tripDto.driverPrice, driverPrice) == 0 &&
                Objects.equals(departure, tripDto.departure) &&
                Objects.equals(destination, tripDto.destination) &&
                Objects.equals(startDate, tripDto.startDate) &&
                Objects.equals(endDate, tripDto.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, departure, destination, driverId, carId, driverPrice, startDate, endDate);
    }

    @Override
    public String toString() {
        return "TripDto{" +
                "id=" + id +
                ", departure='" + departure + '\'' +
                ", destination='" + destination + '\'' +
                ", driverId=" + driverId +
                ", carId=" + carId +
                ", driverPrice=" + driverPrice +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
