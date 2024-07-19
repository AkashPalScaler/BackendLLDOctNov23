package SOLID.BirdV2;

public class Pigeon extends FlyingBird {
    @Override
    void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Pigeon is making sound");
    }
}
