package factory_method;

public class DoubleAnimalFactory implements AnimalFactory {
    private static final int DOG = 1;
    private static final int CAT = 2;

    private static int animalCount = 0;
    private static int animalType = DOG;

    private void updateAnimalCount(int currentAnimalType) {
        animalCount++;
        if(animalCount == 2) {
            animalCount = 0;
            if(currentAnimalType == CAT) {
                animalType = DOG;
            } else {
                animalType = CAT;
            }
        }
    }

    @Override
    public Animal createAnimal() {
        Animal animal;
        if(animalType == DOG) {
            animal = new Dog();
            updateAnimalCount(DOG);
        } else {
            animal = new Cat();
            updateAnimalCount(CAT);
        }
        return animal;
    }
}
