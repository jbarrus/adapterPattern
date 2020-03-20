public class Bat_Adapter implements Bird {

    private Bat batsy;

    public Bat_Adapter(Bat batsy) {
        this.batsy = batsy;
    }

    @Override
    public String fly() {
        batsy.stopSingign();
        batsy.startToRun();
        batsy.warmWings();
        return batsy.fly();
    }

    @Override
    public String sing() {
        batsy.stopFlying();
        batsy.sitDown();
        batsy.warmVoice();
        return batsy.makeSound();
    }


}
