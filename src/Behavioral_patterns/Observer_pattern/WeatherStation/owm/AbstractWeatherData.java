package Behavioral_patterns.Observer_pattern.WeatherStation.owm;

import org.json.JSONObject;

/**
 * Created by podo on 20.03.15.
 */
public abstract class AbstractWeatherData {

    protected static final String JSON_MAIN = "main";
    protected static final String JSON_COORD = "coord";
    protected static final String JSON_WIND = "wind";
    protected static final String JSON_WEATHER = "weather";


    public static abstract class Coord{
        protected static final String JSON_lat = "lat";
        protected static final String JSON_lon = "lon";
    }

    public static abstract class Main{
        protected static final String JSON_TEMP = "temp";
        protected static final String JSON_TEMP_MIN = "temp_min";
        protected static final String JSON_TEMP_MAX = "temp_max";
        protected static final String JSON_PRESSURE = "pressure";
        protected static final String JSON_HUMIDITY = "humidity";
    }

    public static abstract class Wind{
        protected static final String JSON_SPEED = "speed";

    }

    public static abstract class Weather{
        protected static final String JSON_DESCRIPTION = "description";
    }
}
