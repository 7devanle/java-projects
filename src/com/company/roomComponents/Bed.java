package com.company.roomComponents;

public class Bed {
    private String manufacturer;
    private Dimensions dimensions;
    private double weight;

    public Bed(String maker, Dimensions dimensions, double weight) {
        this.manufacturer = maker;
        this.dimensions = dimensions;
        this.weight = weight;
    }

    public String getMaker() {
        return manufacturer;
    }

    public void setMaker(String maker) {
        this.manufacturer = maker;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void increseWeight(double weight){
        this.weight += weight;
    }
}
