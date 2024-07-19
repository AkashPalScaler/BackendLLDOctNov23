package SOLID.BirdV0;

public class Bird {
    String type;
    String name;
    String color;
    Integer wings;

    void eat(){
        //Algorithm(multiple lines of code) to make bird eat
        System.out.println("Bird is eating");
    }

    void fly(){
        if(type == "pigeon"){
            System.out.println("Pigeon is flying");
        }else if(type == "crow") {
            System.out.println("Crow is flying");
        }else if(type == "sparrow"){
            System.out.println("Sparrow is flying");
        }
    }
    void makeSound(){
        if(type == "pigeon"){
            System.out.println("Pigeon is make sound");
        }else if(type == "crow") {
            System.out.println("Crow is making sound");
        }else if(type == "sparrow"){
            System.out.println("Sparrow is making sound");
        }
    }

}
