package com.company.roomComponents;

public class Room {
    private Bed bed ;
    private Windows windows;
    private Person person;
    private Fan fan;
    private double temperature;

    public Room(Bed bed, Windows windows, Person person, Fan fan) {
        this.bed = bed;
        this.windows = windows;
        this.person = person;
        this.fan = fan;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Windows getWindows() {
        return windows;
    }

    public void setWindows(Windows windows) {
        this.windows = windows;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public String getTemperature() {
        return temperature + " degrees";
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}
