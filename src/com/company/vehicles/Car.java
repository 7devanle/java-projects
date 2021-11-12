package com.company.vehicles;

public class Car extends Vehicle{
    private int tyres;
    private String carModel;
    private int doors;
    private int seat;
    private double maxSpeed;


    public Car(){
        this(23.5, "Car", 23.5, "Car park", 1, 4, "Honda", 4, 3, 240.99);
    }
    public Car(double weight, String typeOfVehicle, double length, String portType, int drivers, int tyres,
               String carModel, int doors, int seat, double maxSpeed) {
        super(weight, typeOfVehicle, length, portType, drivers);
        this.tyres = tyres;
        this.carModel = carModel;
        this.doors = doors;
        this.seat = seat;
        this.maxSpeed = maxSpeed;
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String setGears(int gear){
        switch (gear){
            case 1:
                maxSpeed = 30;
                break;
            case 2:
                maxSpeed = 60;
                break;

            case 3:
                maxSpeed = 90;
                break;

            case 4:
                maxSpeed = 120;
                break;

            case 5:
                maxSpeed = 240;
                break;
            default:
                maxSpeed = 00;
                System.out.println("!!!!!!!");
                throw new IllegalStateException("Unexpected value: " + gear);
        }
        return "gear " + gear;
    }
}
