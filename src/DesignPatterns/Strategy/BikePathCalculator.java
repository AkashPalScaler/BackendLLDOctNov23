package DesignPatterns.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String Destination) {
        System.out.println("Travelling in bike");
    }
}
