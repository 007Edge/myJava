package OPP.Interfaces;

public class NiceCar {
    private Engine engine;
    private Music player = new CDPlayer();

    NiceCar() {
        engine = new PowerEngine();
    }

    NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }




}
