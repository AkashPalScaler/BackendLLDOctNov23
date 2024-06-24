package Interfaces;

public class Client {
    public static void startRace(Runner r){
        r.run();
    }
    public static void main(String[] args) {
        Dog d = new Dog();
        Runner r = new Dog();
//        r.run();
//        d.run();
//        r.rehydrate();
//
//        d.bark();
//        r.bark();
        r.rest();
    }

}
