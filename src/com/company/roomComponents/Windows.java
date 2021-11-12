package com.company.roomComponents;

public class Windows {
    private Dimensions dimension;
    private String Manufacturer;
    private boolean Slide;

    public Windows(Dimensions dimension, String manufacturer, boolean slide) {
        this.dimension = dimension;
        Manufacturer = manufacturer;
        Slide = slide;
    }

    public Dimensions getDimension() {
        return dimension;
    }

    public void setDimension(Dimensions dimension) {
        this.dimension = dimension;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public boolean isSlide() {
        return Slide;
    }

    public void setSlide(boolean slide) {
        Slide = slide;
    }
}
