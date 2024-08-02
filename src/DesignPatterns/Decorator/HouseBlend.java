package DesignPatterns.Decorator;

public class HouseBlend implements Beverage{
    Integer cost = 150;
    String description = "Signature house blend of Starbuzz";
    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
