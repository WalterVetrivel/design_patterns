package adapter;

public class Adapter implements IAdapter {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        this.adaptee.specificRequest();
    }
}
