package SOLID.BirdV1;

public class Sparrow extends Bird{
    @Override
    void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is making sound");
    }
}
