package Behavioral_patterns.Observer_pattern.WeatherStation.owm;


import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;


/**
 * Created by podo on 20.03.15.
 */
public class OWMClient {

    private String baseURL = "http://api.openweathermap.org/data/2.5/";

    private HttpURLConnection httpURLConnection;

    public OWMClient() {
    }


    public OWMWeatherData currentWeatherAtCity(String city) throws IOException, JSONException {
        String subUrl = String.format(Locale.ROOT, "weather?q=%s&units=metric&lang=ru", city);
        String fullUrl = baseURL + subUrl;
        JSONObject response = null;
        response = doQuery(fullUrl);
        return new OWMWeatherData(response);
    }

    public JSONObject doQuery(String url) throws IOException, JSONException {

        String response = "";

        try {
            URL url_weather = new URL(url);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url_weather.openConnection();

            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                InputStreamReader inputStreamReader =
                        new InputStreamReader(httpURLConnection.getInputStream());
                BufferedReader bufferedReader =
                        new BufferedReader(inputStreamReader, 8192);
                String line = null;
                while ((line = bufferedReader.readLine()) != null) {
                    response += line;
                }

                bufferedReader.close();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new JSONObject(response);

    }


}
