package kata;

public class DuckBirdAdapter implements Bird {
    Duck duck;

    public DuckBirdAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public String fly() {
        return duck.fly();
    }

    @Override
    public String sing() {
        return duck.makeSound();
    }
}
