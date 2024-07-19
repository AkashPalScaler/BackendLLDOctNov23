package SOLID.BirdV1;

public class Pigeon extends Bird{
    @Override
    void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Pigeon is making sound");
    }
}
