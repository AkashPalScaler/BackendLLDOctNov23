package DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {

        Beverage b = new HouseBlend();
        Beverage b1 = new Milk(new Milk(new Cream(new HouseBlend())));
        b1.getCost();
        b = new Milk(b);//b-> both houseblend+milk

        System.out.println(b.getDescription());
        System.out.println("Total cost : "+ b.getCost());
        System.out.println("****** Before Adding cream ******s");

        b = new Cream(b);
        b = new Cream(b);
        b = new Milk(b);

        System.out.println(b.getDescription());
        System.out.println("Total cost : "+ b.getCost());

    }
}
