package pl.sda.interfaces;

public class AnimalTest {

    public static void main(String[] args) {


        Animal bird = new Bird();
        Animal fish = new Fish();
        Animal insect = new Insect();

        Animal[] animals = {bird, fish, insect};

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says " + animal.speak());
        }
    }
}
