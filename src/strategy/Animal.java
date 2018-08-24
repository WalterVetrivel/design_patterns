package strategy;

public class Animal {
    private String name;
    private double height;
    private int weight;
    private String sound;

    private Flies flyingType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if(weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be greater than 0");
        }
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public Flies getFlyingType() {
        return flyingType;
    }

    public void setFlyingType(Flies flyingType) {
        this.flyingType = flyingType;
    }

    public String tryToFly() {
        return flyingType.fly();
    }
}
