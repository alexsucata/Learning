package com.alexsucata.composition.pc_simulation;

public class Motherboard {
    private String model;
    private String manufacturer;
    private Integer ramSlots;
    private Integer cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, Integer ramSlots, Integer cardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadProgram (String programName){
        System.out.println(programName + " is loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Integer getRamSlots() {
        return ramSlots;
    }

    public Integer getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
