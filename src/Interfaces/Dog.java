package Interfaces;

public class Dog extends Animal implements Runner {
    void bark(){
        System.out.println(x);
//        x =12;
        System.out.println("Dog is barking!");
    }
    public void run(){
        System.out.println("Dog is running");
    }
    public void rehydrate(){
        System.out.println("Dog drinks water");
    }

    public void rest(){
        System.out.println("Doig take rest");
    }
}
