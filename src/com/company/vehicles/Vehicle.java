package com.company.vehicles;

public class Vehicle {
    private double weight;
    private String typeOfVehicle;
    private double length;
    private String portType;
    private int drivers;

    public Vehicle(){
        this(90213.679, "Airport");
    }
    public Vehicle(double weight, String portType){
        this(weight, "Airplane", 3490.9, portType, 2);
    }
    public Vehicle(double weight, String typeOfVehicle, double length, String portType, int drivers) {
        this.weight = weight;
        this.typeOfVehicle = typeOfVehicle;
        this.length = length;
        this.portType = portType;
        this.drivers = drivers;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getPortType() {
        return portType;
    }

    public void setPortType(String portType) {
        this.portType = portType;
    }

    public int getDrivers() {
        return drivers;
    }

    public void setDrivers(int drivers) {
        this.drivers = drivers;
    }
}
