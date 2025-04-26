package OPP.Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car e1 = new Car();
//        e1.start();
//        e1.stop();
//        e1.stopCar();
//        e1.acc();

        NiceCar n = new NiceCar();

        n.start();
        n.startMusic();
        n.upgradeEngine();
        n.start();



        // NOTE by default interface Methods are public and properties are final and static


    }
}

