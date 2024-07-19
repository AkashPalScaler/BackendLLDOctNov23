package SOLID.BirdV2;

public class Client {
    public static void main(String[] args) {
        FlyingBird pigeon = new Pigeon();
        pigeon.type = "pigeon";

        pigeon.fly();

        NonFlyingBird penguin = new Penguin();

    }
}
