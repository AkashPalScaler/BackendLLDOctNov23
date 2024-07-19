package SOLID.BirdV1;

public class Penguin extends Bird{
    @Override
    void fly() throws Exception {
        //Penguins can't fly
        //Leave it empty
        //Throw an exception
        throw new Exception("Penguins can't fly");
    }

    @Override
    void makeSound() {
        System.out.println("Penguin is making sound");
    }
}
