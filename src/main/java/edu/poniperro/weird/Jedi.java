package edu.poniperro.weird;

import edu.poniperro.hardware.GasHeater;
import edu.poniperro.interfaces.Heater;
import edu.poniperro.types.Color;
import edu.poniperro.types.RoomTemperature;

public class Jedi implements Heater {

    public void engage(RoomTemperature temperature){
        RoomTemperature.incrementTemperature(this.toucheLightSable());
    }
    public void disengage(RoomTemperature temperature){
        Heater heater = new GasHeater();
        this.forcePersuasion(heater, temperature);
    }

    private double toucheLightSable(){
        return 1400;
    }

    private void forcePersuasion(Heater heater, RoomTemperature temperature){
        RoomTemperature.incrementTemperature(-1400);
        heater.disengage(temperature);
    }

    public void speak(){
        System.out.println("\n" + Color.GREEN
                + "\t  __.-._   \n"
                + "\t  '-._\"7' \n"
                + "\t   /'.-c   \n"
                + "\t   |  /T   \n"
                + "\t  _)_/LI   \n" + Color.RESET
                + "\nDo or do not. There is no try ");
    }
}
