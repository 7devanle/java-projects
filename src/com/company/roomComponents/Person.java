package com.company.roomComponents;

public class Person {
    private Names name;
    private String height;
    private double weight;
    Names name1 = new Names("Bolaji", "Olorunsogo");

    public Person(Names name, String height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;

    }

    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void sleep(){
        System.out.println("Person is sleeping");
    }
}
