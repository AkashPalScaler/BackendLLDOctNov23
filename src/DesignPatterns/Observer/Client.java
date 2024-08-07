package DesignPatterns.Observer;

import javax.swing.plaf.ColorUIResource;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);


        weatherData.setWeatherData(29f, 100, 250);
        weatherData.setWeatherData(32f, 50, 360);

        statisticsDisplay.deRegister();

        weatherData.setWeatherData(30f, 10, 200);

        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);

        weatherData.setWeatherData(29f, 100, 250);
        weatherData.setWeatherData(32f, 50, 360);
    }
}
