package factory_method;

public class AnimalFactoryApp {
    public static void main(String[] args) {
        AnimalFactory alternateAnimalFactory = new AlternateAnimalFactory();
        Animal animal_1 = alternateAnimalFactory.createAnimal();
        Animal animal_2 = alternateAnimalFactory.createAnimal();
        Animal animal_3 = alternateAnimalFactory.createAnimal();
        Animal animal_4 = alternateAnimalFactory.createAnimal();

        System.out.println("Animals created using AlternateAnimalFactory: ");

        animal_1.displayType();
        animal_2.displayType();
        animal_3.displayType();
        animal_4.displayType();

        AnimalFactory doubleAnimalFactory = new DoubleAnimalFactory();
        Animal animal_5 = doubleAnimalFactory.createAnimal();
        Animal animal_6 = doubleAnimalFactory.createAnimal();
        Animal animal_7 = doubleAnimalFactory.createAnimal();
        Animal animal_8 = doubleAnimalFactory.createAnimal();

        System.out.println("Animals created using DoubleAnimalFactory");

        animal_5.displayType();
        animal_6.displayType();
        animal_7.displayType();
        animal_8.displayType();
    }
}
