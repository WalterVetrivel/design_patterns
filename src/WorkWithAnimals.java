public class WorkWithAnimals {
    public static void main(String[] args) {
        Dog fido = new Dog();
        fido.setName("Fido");
        changeObjectName(fido);
        System.out.println(fido.getName());
        fido.digHole();
        fido.setWeight(-1);

        Animal doggy = new Dog();
        Animal kitty = new Cat();

        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());

        Animal[] animals = new Animal[2];
        animals[0] = doggy;
        animals[1] = kitty;

        for (Animal animal: animals) {
            animalSound(animal);
        }

        ((Dog) doggy).digHole();

        Giraffe giraffe = new Giraffe();
        giraffe.setName("Frank");

        System.out.println(giraffe.getName());
    }

    public static void changeObjectName(Dog fido) {
        fido.setName("Marcus");
    }

    public static void animalSound(Animal animal) {
        System.out.println("Animal says: " + animal.getSound());
    }
}
