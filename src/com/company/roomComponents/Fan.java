package com.company.roomComponents;

public class Fan {
    private String fanType;
    private double speed;
    private int blades;
    private boolean on;

    public Fan(String fanType, double speed, int blades) {
        this.fanType = fanType;
        this.speed = speed;
        this.blades = blades;
        this.on = false;
    }

    public String getFanType() {
        return fanType;
    }

    public void setFanType(String fanType) {
        this.fanType = fanType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getBlades() {
        return blades;
    }

    public void setBlades(int blades) {
        this.blades = blades;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public boolean PushFanButton(){
        if(on == true){
            return false;
        }
        System.out.println("fan started");
        return true;
    }
}
