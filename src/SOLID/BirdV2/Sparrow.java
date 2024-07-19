package SOLID.BirdV2;

public class Sparrow extends FlyingBird {
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is making sound");
    }
}
