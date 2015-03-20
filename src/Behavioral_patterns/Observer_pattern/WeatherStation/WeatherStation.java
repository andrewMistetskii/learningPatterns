package Behavioral_patterns.Observer_pattern.WeatherStation;

import Behavioral_patterns.Observer_pattern.WeatherStation.observer.CurrentWeatherDisplay;
import Behavioral_patterns.Observer_pattern.WeatherStation.subject.WeatherData;
import org.json.JSONException;

import java.io.IOException;

/**
 * Created by podo on 20.03.15.
 */
public class WeatherStation {

    public static void main(String[] args) throws IOException, JSONException {

        WeatherData weatherData = new WeatherData();

        CurrentWeatherDisplay weatherDisplay =
                new CurrentWeatherDisplay("Хмельницкий", weatherData);

        weatherData.setMeasurement(weatherDisplay.getCity());

    }
}
