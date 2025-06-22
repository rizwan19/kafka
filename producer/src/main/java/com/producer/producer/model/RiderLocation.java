package com.producer.producer.model;

public class RiderLocation {
    private long riderId;
    private double latitude;
    private double longitude;

    public RiderLocation(long riderId, double latitude, double longitude) {
        this.riderId = riderId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public long getRiderId() {
        return riderId;
    }

    public void setRiderId(long riderId) {
        this.riderId = riderId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "RiderLocation{" +
                "riderId=" + riderId +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
