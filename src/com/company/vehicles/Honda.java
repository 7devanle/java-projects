package com.company.vehicles;

import java.util.Calendar;
import java.util.Date;

public class Honda extends Car{
    private String carOwner;
    private String carName;
    private double speed;
    private Date expiringDate = new Date(2026, Calendar.FEBRUARY,12);

    public Honda(double weight, String typeOfVehicle, double length, String portType, int drivers, int tyres, String carModel,
                 int doors, int seat, double maxSpeed, String carOwner, String carName, double speed) {
        super(weight, typeOfVehicle, length, portType, drivers, tyres, carModel, doors, seat, maxSpeed);
        this.carOwner = carOwner;
        this.carName = carName;
        this.speed = speed;
    }

    public String getCarOwner() {
        return carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Date getExpiringDate() {
        return expiringDate;
    }

    public void setExpiringDate(Date expiringDate) {
        this.expiringDate = expiringDate;
    }
}
