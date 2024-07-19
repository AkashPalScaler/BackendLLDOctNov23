package SOLID.BirdV3;

public class Sparrow extends Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is making sound");
    }
}
