package edu.poniperro.types;

public class RoomTemperature {
    private static double temperature = 0;

    private static RoomTemperature roomTemperature;

    public static RoomTemperature getInstance() {
        if (roomTemperature == null) {
            roomTemperature = new RoomTemperature();
        }
        return roomTemperature;
    }

    private RoomTemperature(){
    }

    public static double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public static void incrementTemperature(double increment){
        RoomTemperature.temperature += increment;
    }
}
