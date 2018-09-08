package adapter;

public class Client {
    public static void main(String[] args) {
        IAdapter adapter = new Adapter(new Adaptee());
        adapter.request();
    }
}
