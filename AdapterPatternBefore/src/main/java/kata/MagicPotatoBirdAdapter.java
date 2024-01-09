package kata;

public class MagicPotatoBirdAdapter implements Bird {
    MagicPotato potato;

    public MagicPotatoBirdAdapter(MagicPotato potato) {
        this.potato = potato;
    }

    @Override
    public String fly() {
        return potato.rolling();
    }

    @Override
    public String sing() {
        return potato.talk();
    }
}
