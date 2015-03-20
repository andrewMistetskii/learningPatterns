package Behavioral_patterns.Observer_pattern.WeatherStation.subject;

import Behavioral_patterns.Observer_pattern.WeatherStation.observer.Observer;

/**
 * Created by podo on 20.03.15.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
