package SOLID.BirdV5;

public class Crow extends Bird implements Flyable
{
    FlyingMethod f;
    public Crow(FlyingMethod f){
        this.f = f;
    }
    @Override
    public void fly() {
        f.makeFly();
    }

    @Override
    void makeSound() {

    }
}
