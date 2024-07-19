package SOLID.BirdV5;

public class Pigeon extends Bird implements Flyable {
    FlyingMethod f = new FlyHigh();
    @Override
    public void fly() {
        f.makeFly();
    }

    @Override
    void makeSound() {
        System.out.println("Pigeon is making sound");
    }
}
