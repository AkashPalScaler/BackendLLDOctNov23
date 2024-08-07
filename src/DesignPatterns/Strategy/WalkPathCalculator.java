package DesignPatterns.Strategy;

public class WalkPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String Destination) {
        System.out.println("travelling by foot");
    }
}
