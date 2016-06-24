package ObserverPattern.WeatherData.theoImplementation;

/**
 * Created by dj_di_000 on 14/6/2016.
 */
public class MainObserver {



    public static void main(String args[]) {

        WeatherData weatherData= new WeatherData();

        //The observes will register on their own to the Subject(parameter) !
        CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay= new ForecastDisplay(weatherData);

        //Just set new Measurements and the observers will be updated!
        weatherData.setMeasurements(73.6f,85.0f,42.3f);
        weatherData.setMeasurements(32.9f,82.9f,98.2f);



    }
}
