package DesignPatterns.Decorator;

public interface Beverage {
    Integer getCost();
    String getDescription();
}


 //<<Beverage>> ---extended--> <<Addon>> ---implementing--> Milk, Cream, etc
 //     !----implementing-----> HouseBlend, Decaf

// Beverage b = Milk, Cream, houseBlend, Decaf