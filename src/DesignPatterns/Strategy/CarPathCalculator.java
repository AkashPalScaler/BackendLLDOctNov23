package DesignPatterns.Strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String Destination) {
        System.out.println("Travelling in a car");
    }
}
