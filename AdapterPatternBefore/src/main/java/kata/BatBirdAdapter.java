package kata;

public class BatBirdAdapter implements Bird {
    Bat bat;

    public BatBirdAdapter(Bat bat) {
        this.bat = bat;
    }

    @Override
    public String fly() {
        bat.stopSing();
        bat.startToRun();
        bat.warmWings();
        return bat.fly();
    }

    @Override
    public String sing() {
        bat.stopFlying();
        bat.sitDown();
        bat.warmVoice();
        return bat.makeSound();
    }
}
