package DesignPatterns.Decorator;

public class Cream implements Addon{
    Beverage b; // It's dependent on a beverage
    Integer cost = 50;
    String description = "Additional fat free heavy cream";

    public Cream(Beverage b){
        this.b = b;
    }

    @Override
    public Integer getCost() {
        return b.getCost() + cost;
    }

    @Override
    public String getDescription() {
        return b.getDescription() + "\n" +description;
    }
}
