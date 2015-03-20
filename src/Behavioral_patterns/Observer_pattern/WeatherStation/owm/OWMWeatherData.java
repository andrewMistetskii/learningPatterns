package Behavioral_patterns.Observer_pattern.WeatherStation.owm;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.math.BigDecimal;

/**
 * Created by podo on 20.03.15.
 */
public class OWMWeatherData extends AbstractWeatherData {

    private static JSONObject jsonObject;


    private class Main extends AbstractWeatherData.Main {
        private final double temp;
        private final double minTemp;
        private final double maxTemp;
        private final double pressure;
        private final double humidity;


        private Main() throws JSONException {

            JSONObject mainJSONObject = jsonObject.getJSONObject(JSON_MAIN);
            temp = mainJSONObject.getDouble(JSON_TEMP);
            minTemp = mainJSONObject.getDouble(JSON_TEMP_MIN);
            maxTemp = mainJSONObject.getDouble(JSON_TEMP_MAX);
            pressure = mainJSONObject.getDouble(JSON_PRESSURE);
            humidity = mainJSONObject.getDouble(JSON_HUMIDITY);
        }


    }

    private class Wind extends AbstractWeatherData.Wind {
        private final double speed;

        public Wind() throws JSONException {
            JSONObject windJSONObject = jsonObject.getJSONObject(JSON_WIND);
            this.speed = windJSONObject.getDouble(JSON_SPEED);
        }


    }

    private class Coord extends AbstractWeatherData.Coord {
        private final double latitude;
        private final double longitude;

        private Coord() throws JSONException {
            JSONObject coodrJSONObject = jsonObject.getJSONObject(JSON_COORD);
            latitude = coodrJSONObject.getDouble(JSON_lat);
            longitude = coodrJSONObject.getDouble(JSON_lon);
        }
    }

    private class Weather extends AbstractWeatherData.Weather {
        private final String description;

        private Weather() throws JSONException {
            JSONArray weatherJSONArray = jsonObject.getJSONArray(JSON_WEATHER);

            JSONObject weatherJSONObject = weatherJSONArray.getJSONObject(0);
            description = weatherJSONObject.getString(JSON_DESCRIPTION);
        }

    }

    private final Main main;
    private final Coord coord;
    private final Weather weather;
    private final Wind wind;

    public OWMWeatherData(JSONObject response) throws JSONException {
        this.jsonObject = response;

        this.main = new Main();
        this.coord = new Coord();
        this.wind = new Wind();
        this.weather = new Weather();
    }


    public String getTemp() {
        String temp = new BigDecimal(this.main.temp).
                setScale(0, BigDecimal.ROUND_HALF_UP).
                toString();
        return temp;
    }

    public String getMinTemp() {
        String minTemp = new BigDecimal(this.main.minTemp).
                setScale(0, BigDecimal.ROUND_HALF_UP).toString();
        return minTemp;
    }

    public String getMaxTemp() {
        String minTemp = new BigDecimal(this.main.maxTemp).
                setScale(0, BigDecimal.ROUND_HALF_UP).toString();
        return minTemp;
    }

    public String getPressure() {
        String pressure = new BigDecimal(this.main.pressure * 0.75).
                setScale(0, BigDecimal.ROUND_HALF_UP).
                toString() + " мм.рт.ст";
        return pressure;
    }

    public String getHumidity() {
        String humidity = Double.toString(this.main.humidity) + "%";
        return humidity;
    }

    public String getSpeed() {
        String speed = Double.toString(this.wind.speed * 3.6) + " км/ч";
        return speed;
    }

    public double getLat() {
        return this.coord.latitude;
    }

    public double getLon() {
        return this.coord.longitude;
    }

    public String getDescription() {
        return this.weather.description;
    }
}
