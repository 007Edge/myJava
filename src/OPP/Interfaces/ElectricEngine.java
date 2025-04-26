package OPP.Interfaces;

public class ElectricEngine implements Engine{
    public void start() {
        System.out.println("Electric Engine Starts");
    }

    public void stop() {
        System.out.println("Electric Engine Stops");
    }

    public void acc() {
        System.out.println("instant acceleration");
    }
}
