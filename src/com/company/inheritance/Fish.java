package com.company.inheritance;

public class Fish extends Animal{
    private int gils;
    private int scales;
    private int eyes;
    private int fins;

    public Fish(String name, int size, double weight, int gils, int scales, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gils = gils;
        this.scales = scales;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    public void swim(int speed){
        moveBackFin();
        moveMuscles();
        move(speed);
    }

    @Override
    public void move(double speed){
        System.out.println("swimming at speed " +speed);
    }
}