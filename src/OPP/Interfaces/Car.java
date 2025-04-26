package OPP.Interfaces;

import java.sql.SQLOutput;

public class Car implements Engine, Break, Music{
    public void start() {
        System.out.println("Engine Starts");
    }
    public void stop() {
        System.out.println("Engine Stop");
    }

    public void stopCar() {
        System.out.println("Car Stops");
    }

    public void acc() {
        System.out.println("Car is Accleration");
    }

}
