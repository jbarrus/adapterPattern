public class BatAdapter implements Bird {

    private Bat batsy;

    public BatAdapter(Bat batsy) {

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
