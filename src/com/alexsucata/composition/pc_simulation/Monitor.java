package com.alexsucata.composition.pc_simulation;

public class Monitor {
    private String model;
    private String manufacturer;
    private Integer size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, Integer size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(Integer x, Integer y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color" + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Integer getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
