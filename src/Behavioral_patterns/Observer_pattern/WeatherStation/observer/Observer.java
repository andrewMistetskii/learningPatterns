package Behavioral_patterns.Observer_pattern.WeatherStation.observer;

/**
 * Created by podo on 20.03.15.
 */
public interface Observer {
    void update(String temperature, String humidity, String pressure, String speed, String description);
    String getCity();
}
