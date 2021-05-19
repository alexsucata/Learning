package com.alexsucata.composition.pc_simulation;

public class AppMain {

    public static void main(String[] args) {
        Case theCase = new Case("Wezen", "AQIRYS", "750", new Dimensions(208, 418, 400));

        Monitor theMonitor = new Monitor("LC49J890DK", "Samsung", 49, new Resolution(3840, 1080));

        Motherboard theMotherboard = new Motherboard("B365M", "Gigabyte", 4, 4, "AMI UEFI BIOS");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();
    }
}
