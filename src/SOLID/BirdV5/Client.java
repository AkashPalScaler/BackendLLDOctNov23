package SOLID.BirdV5;

import SOLID.BirdV2.FlyingBird;

public class Client {
    public static void main(String[] args) throws Exception {
        Bird pigeon = new Pigeon();
        pigeon.type = "pigeon";

        Crow crow = new Crow(new FlyLow()); //Dependecny injection
    }
}
