package Behavioral_patterns.Observer_pattern.WeatherStation.observer;

import Behavioral_patterns.Observer_pattern.WeatherStation.subject.Subject;
import org.apache.commons.lang3.text.WordUtils;

/**
 * выводит текущие значения переменных объекта WeatherData
 */
public class CurrentWeatherDisplay implements Observer, DisplayElement{

    private String city;
    private String temperature;
    private String humidity ;
    private String pressure;
    private String speed;
    private String description;
    private Subject weatherData;

    public CurrentWeatherDisplay(String city, Subject weatherData) {
        this.city = city;
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(city + "\n"  + WordUtils.capitalize(description) + "\n" +
                           "Температура: " + temperature + " градусов" + "\n" +
                           "Влажность: " + humidity + "\n" +
                           "Атмосферное давление: " + pressure + "\n" +
                           "Скорость ветра: " + speed);
    }

    @Override
    public void update(String temperature, String humidity, String pressure,  String speed, String description) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.speed = speed;
        this.description = description;
        display();
    }

    @Override
    public String getCity() {
        return this.city;
    }
}
