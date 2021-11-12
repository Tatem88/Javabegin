package Lesson7;

import Lesson7.enums.Periods;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


import java.io.IOException;

public class AccuWeatherProvider implements WeatherProvider {

    private static final String BASE_HOST = "dataservice.accuweather.com";
    private static final String FORECAST_ENDPOINT = "forecasts";
    private static final String CURRENT_CONDITIONS_ENDPOINT = "currentconditions";
    private static final String API_VERSION = "v1";
    private static final String API_KEY = ApplicationGlobalState.getInstance().getApiKey();

    private final OkHttpClient client = new OkHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public void getWeather(Periods periods) throws IOException {
        String cityKey = detectCityKey();
        if (periods.equals(Periods.NOW)) {
            HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host(BASE_HOST)
                .addPathSegment(CURRENT_CONDITIONS_ENDPOINT)
                .addPathSegment(API_VERSION)
                .addPathSegment(cityKey)
                .addQueryParameter("apikey", API_KEY)
                .build();

            Request request = new Request.Builder()
                .addHeader("accept", "application/json")
                .url(url)
                .build();

            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Невозможно прочесть информацию о городе. " +
                        "Код ответа сервера = " + response.code() + " тело ответа = " + response.body().string());
            }

            String jsonResponse = response.body().string();
          //  System.out.println(jsonResponse);

            String cityTemp = objectMapper.readTree(jsonResponse).get(0).at("/Temperature/Metric/Value").asText();
            String tempCelsius = objectMapper.readTree(jsonResponse).get(0).at("/Temperature/Metric/Unit").asText();
            String WeatherText = objectMapper.readTree(jsonResponse).get(0).at("/WeatherText").asText();
            System.out.println("Температура в городе сегодня: " + cityTemp + tempCelsius + " " + WeatherText);
            // TODO: Сделать в рамках д/з вывод более приятным для пользователя.
            //  Создать класс WeatherResponse, десериализовать ответ сервера в экземпляр класса
            //  Вывести пользователю только текущую температуру в C и сообщение (weather text)
        }

        if (periods.equals(Periods.FIVE_DAYS)) {
            HttpUrl url = new HttpUrl.Builder()
                    .scheme("http")
                    .host(BASE_HOST)
                    .addPathSegment(FORECAST_ENDPOINT)
                    .addPathSegment(API_VERSION)
                    .addPathSegment("daily")
                    .addPathSegment("5day")
                    .addPathSegment(cityKey)
                    .addQueryParameter("apikey", API_KEY)
                    .build();

            Request request = new Request.Builder()
                    .addHeader("accept", "application/json")
                    .url(url)
                    .build();

            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) {
                throw new IOException("Невозможно прочесть информацию о городе. " +
                        "Код ответа сервера = " + response.code() + " тело ответа = " + response.body().string());
            }

            String jsonResponse = response.body().string();
            System.out.println(jsonResponse);

            String cityTemp = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(0).at("/Temperature/Minimum/Value").asText();
            String tempCelsius = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(0).at("/Temperature/Minimum/Unit").asText();
            String WeatherText = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(0).at("/Day/IconPhrase").asText();

            String cityTemp1 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(1).at("/Temperature/Minimum/Value").asText();
            String tempCelsius1 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(1).at("/Temperature/Minimum/Unit").asText();
            String WeatherText1 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(1).at("/Day/IconPhrase").asText();

            String cityTemp2 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(2).at("/Temperature/Minimum/Value").asText();
            String tempCelsius2 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(2).at("/Temperature/Minimum/Unit").asText();
            String WeatherText2 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(2).at("/Day/IconPhrase").asText();

            String cityTemp3 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(3).at("/Temperature/Minimum/Value").asText();
            String tempCelsius3 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(3).at("/Temperature/Minimum/Unit").asText();
            String WeatherText3 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(3).at("/Day/IconPhrase").asText();

            String cityTemp4 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(4).at("/Temperature/Minimum/Value").asText();
            String tempCelsius4 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(4).at("/Temperature/Minimum/Unit").asText();
            String WeatherText4 = objectMapper.readTree(jsonResponse).at("/DailyForecasts").get(4).at("/Day/IconPhrase").asText();

            System.out.println("Температура в городе сегодня: " + cityTemp + tempCelsius + " " + WeatherText);
            System.out.println("Температура в городе завтра: " + cityTemp1 + tempCelsius1 + " " + WeatherText1);
            System.out.println("Температура в городе послезавтра: " + cityTemp2 + tempCelsius2 + " " + WeatherText2);
            System.out.println("Температура в городе через четыре дня: " + cityTemp3 + tempCelsius3 + " " + WeatherText3);
            System.out.println("Температура в городе через пять дней: " + cityTemp4 + tempCelsius4 + " " + WeatherText4);
            // TODO: Сделать в рамках д/з вывод более приятным для пользователя.
            //  Создать класс WeatherResponse, десериализовать ответ сервера в экземпляр класса
            //  Вывести пользователю только текущую температуру в C и сообщение (weather text)
        }


    }



    public String detectCityKey() throws IOException {
        String selectedCity = ApplicationGlobalState.getInstance().getSelectedCity();

        HttpUrl detectLocationURL = new HttpUrl.Builder()
            .scheme("http")
            .host(BASE_HOST)
            .addPathSegment("locations")
            .addPathSegment(API_VERSION)
            .addPathSegment("cities")
            .addPathSegment("autocomplete")
            .addQueryParameter("apikey", API_KEY)
            .addQueryParameter("q", selectedCity)
            .build();

        Request request = new Request.Builder()
            .addHeader("accept", "application/json")
            .url(detectLocationURL)
            .build();

        Response response = client.newCall(request).execute();

        if (!response.isSuccessful()) {
            throw new IOException("Невозможно прочесть информацию о городе. " +
                "Код ответа сервера = " + response.code() + " тело ответа = " + response.body().string());
        }
        String jsonResponse = response.body().string();
      //  System.out.println(jsonResponse + "city");
        System.out.println("Произвожу поиск города " + selectedCity);



        if (objectMapper.readTree(jsonResponse).size() > 0) {
            String cityName = objectMapper.readTree(jsonResponse).get(0).at("/LocalizedName").asText();
            String countryName = objectMapper.readTree(jsonResponse).get(0).at("/Country/LocalizedName").asText();
            System.out.println("Найден город " + cityName + " в стране " + countryName);
        } else throw new IOException("Server returns 0 cities");

        return objectMapper.readTree(jsonResponse).get(0).at("/Key").asText();
    }
}
