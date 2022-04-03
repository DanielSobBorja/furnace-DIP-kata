package edu.poniperro.types;

public class RoomTemperature {
    private static double temperature = 0;

    private static RoomTemperature roomTemperature;

    public static RoomTemperature setRoomTemperature(double temperature) {
        if (roomTemperature == null) {
            roomTemperature = new RoomTemperature(temperature);
        } else {
            roomTemperature.setTemperature(temperature);
        }
        return roomTemperature;
    }

    public RoomTemperature(double temperature){
        RoomTemperature.temperature = temperature;
    }

    public static double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        RoomTemperature.temperature = temperature;
    }

    public static void incrementTemperature(double increment){
        RoomTemperature.temperature += increment;
    }
}
