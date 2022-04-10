package edu.poniperro.hardware;

import edu.poniperro.interfaces.Heater;
import edu.poniperro.interfaces.Thermometer;
import edu.poniperro.types.Color;
import edu.poniperro.types.RegulatorDisplayCodes;
import edu.poniperro.types.RoomTemperature;

public class Regulator {
    public void regulate(Thermometer t, Heater h, double minTemp, double maxTemp, RoomTemperature temperature) {
        RegulatorDisplayCodes code;
        while (t.read(temperature) < maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            h.engage(temperature);
            message(code, temperature);
        }
        while (t.read(temperature) > minTemp) {
            code = RegulatorDisplayCodes.WAITING;
            h.disengage(temperature);
            message(code, temperature);
        }
    }

    private void message(RegulatorDisplayCodes code, RoomTemperature temperature) {
        switch (code) {
            case HEATING:
                System.out.println(Color.RED + "Calentando =>" + Color.RESET + temperature.getTemperature() + " C");
                break;
            case WAITING:
                System.out.println(Color.BLUE + "Apagado =>" + Color.RESET + temperature.getTemperature() + " C");
                break;
            default:
                System.out.println("Algo raro sucede...");
                break;
        }
    }
}
