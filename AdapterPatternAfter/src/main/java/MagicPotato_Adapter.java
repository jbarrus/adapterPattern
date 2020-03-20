public class MagicPotato_Adapter implements Bird {

    private MagicPotato potato;

    public MagicPotato_Adapter(MagicPotato potato) {
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
