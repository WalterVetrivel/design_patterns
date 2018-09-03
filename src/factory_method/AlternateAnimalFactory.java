package factory_method;

public class AlternateAnimalFactory implements AnimalFactory {
    private static int turn = 1;

    public Animal createAnimal() {
        if(turn % 2 == 1) {
            AlternateAnimalFactory.turn++;
            return new Dog();
        } else {
            AlternateAnimalFactory.turn++;
            return new Cat();
        }
    }
}
