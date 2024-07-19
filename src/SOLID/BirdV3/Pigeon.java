package SOLID.BirdV3;

public class Pigeon extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Pigeon is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Pigeon is making sound");
    }
}
