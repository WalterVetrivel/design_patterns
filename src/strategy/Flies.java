package strategy;

public interface Flies {
    String fly();
}

class ItFlies implements Flies {

    @Override
    public String fly() {
        return "Flying high!";
    }
}

class CantFly implements Flies {
    public String fly() {
        return "Can't fly.";
    }
}