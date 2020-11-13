package se.nackademin.animals;

public class Main {
    public static void main(String[] args) {

        // Skapa en instans av Animal
        Animal animal = new Animal();
        System.out.println(animal); // toString anropas automatiskt
        System.out.println(animal.toString());

        // Skapa en instans av Dog
        Dog dog = new Dog();
        System.out.println(dog); // toString anropas automatiskt

        // En hund har tillgång till alla metoder i klassen Animal
        dog.eat();
        dog.sleep();
    }
}
