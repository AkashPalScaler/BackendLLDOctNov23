package DesignPatterns.Observer;

import javax.swing.plaf.ColorUIResource;

public class CurrentDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current weather temp= " + (temperature)
                + "/humidity = " + humidity + "/ pressure =" + pressure);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        //No calculations
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }
}
