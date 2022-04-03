package edu.poniperro.hardware;

import edu.poniperro.interfaces.Thermometer;
import edu.poniperro.types.RoomTemperature;

public class RemoteCommandSensor implements Thermometer {
    public double read(RoomTemperature temperature){
        return temperature.getTemperature();
    }
}
