package Lesson7;


import Lesson7.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;

}
