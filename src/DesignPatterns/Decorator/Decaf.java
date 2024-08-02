package DesignPatterns.Decorator;

public class Decaf implements Beverage{
    Integer cost = 120;
    String description = "No Caffein coffee of Starbuzz";

    //Default constructor still present and no custom const taking beverage

    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
