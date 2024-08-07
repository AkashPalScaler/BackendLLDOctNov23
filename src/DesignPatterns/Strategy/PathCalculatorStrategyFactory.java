package DesignPatterns.Strategy;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getStrategy(TravelMode travelMode){
        PathCalculatorStrategy p = null;
        if(travelMode == TravelMode.CAR){
            p = new CarPathCalculator();
        }else if(travelMode == TravelMode.BIKE){
            p = new BikePathCalculator();
        }else if(travelMode == TravelMode.WALK){
            p = new WalkPathCalculator();
        }
        return p;
    }
}
