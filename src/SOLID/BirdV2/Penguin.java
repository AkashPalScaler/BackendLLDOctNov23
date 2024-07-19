package SOLID.BirdV2;

public class Penguin extends NonFlyingBird {
    @Override
    void makeSound() {
        System.out.println("Penguin is making sound");
    }
}
