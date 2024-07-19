package SOLID.BirdV3;

public abstract class Bird {
    String type;
    String name;
    String color;
    Integer wings;

    void eat(){
        //Algorithm(multiple lines of code) to make bird eat
        System.out.println("Bird is eating");
    }

    abstract void makeSound();
}
