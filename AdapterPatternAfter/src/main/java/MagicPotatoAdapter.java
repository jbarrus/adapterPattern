public class MagicPotatoAdapter implements Bird {

    private MagicPotato potato;

    public MagicPotatoAdapter(MagicPotato potato) {
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
