package DesignPatterns.Strategy;

public class GoogleMapas {
    public void findPath(String source, String destination, TravelMode travelMode){
            PathCalculatorStrategy p = PathCalculatorStrategyFactory.getStrategy(travelMode);
            p.findPath(source, destination);
    }
}
