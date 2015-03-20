package Behavioral_patterns.Observer_pattern.WeatherStation.subject;

import Behavioral_patterns.Observer_pattern.WeatherStation.observer.Observer;
import Behavioral_patterns.Observer_pattern.WeatherStation.owm.OWMClient;
import Behavioral_patterns.Observer_pattern.WeatherStation.owm.OWMWeatherData;
import Behavioral_patterns.Observer_pattern.WeatherStation.subject.Subject;
import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by podo on 19.03.15.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private String temperature;
    private String humidity;
    private String pressure;
    private String speed;
    private String description;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer: observers){
            observer.update(temperature, humidity, pressure, speed, description);
        }
    }

    public void measurementChanged(){
        notifyObserver();
    }

    public void setMeasurement(String city) throws IOException, JSONException {
        OWMClient owmClient = new OWMClient();
        OWMWeatherData weatherData = owmClient.currentWeatherAtCity(city);
        this.temperature = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        this.speed = weatherData.getSpeed();
        this.description = weatherData.getDescription();
        measurementChanged();
    }


}
