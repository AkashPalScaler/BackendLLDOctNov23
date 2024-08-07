package DesignPatterns.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private List<Observer> observerList = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void addObserver(Observer o) {
        System.out.println("Observer Added!");
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("******** LET'S NOTIFY *******");
        for(Observer o : observerList){
            o.update(temperature, humidity, pressure);
        }
    }

    public void setWeatherData(float temp, float humidity, float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
