package edu.poniperro.interfaces;

import edu.poniperro.types.RoomTemperature;

public interface Heater {
    public void engage(RoomTemperature temperature);
    public void disengage(RoomTemperature temperature);
}
