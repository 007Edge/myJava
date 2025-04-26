package OPP.Interfaces;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class PowerEngine implements Engine{
    public void start() {
        System.out.println("Power Engine Starts");
    }
    public void stop() {
        System.out.println("Power Engine Stops");

    }
    public void acc() {
        System.out.println("Nitro acceleration");
    }
}
