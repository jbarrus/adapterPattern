public class DuckAdapter implements Bird {

    private  Duck donald;

    public DuckAdapter(Duck donald) {

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
