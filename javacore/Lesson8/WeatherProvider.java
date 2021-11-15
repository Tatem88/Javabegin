package Lesson8;



import Lesson8.entity.WeatherData;
import Lesson8.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}
