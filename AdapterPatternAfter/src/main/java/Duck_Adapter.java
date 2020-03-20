public class Duck_Adapter implements Bird {

    private  Duck donald;

    public Duck_Adapter(Duck donald) {
        this.donald = donald;
    }

    @Override
    public String fly() {
        return donald.fly();
    }

    @Override
    public String sing() {
        return donald.makeSound();
    }
}
