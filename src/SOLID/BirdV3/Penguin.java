package SOLID.BirdV3;

import java.util.Stack;

public class Penguin extends Bird implements Swimable{

    @Override
    void makeSound() {
        System.out.println("Penguin is making sound");
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
