package SOLID.BirdV5;

public class Sparrow extends Bird implements Flyable {
    FlyingMethod f = new FlyLow();@Override
    public void fly() {

        f.makeFly();
    }

    @Override
    void makeSound() {
        System.out.println("Sparrow is making sound");
    }
}
