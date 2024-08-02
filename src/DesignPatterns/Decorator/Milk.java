package DesignPatterns.Decorator;

public class Milk implements Addon{
    Beverage b;
    Integer cost = 20;
    String description = "Additional 2% skimmed Milk";

    public Milk(Beverage b){
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
