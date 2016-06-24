package ObserverPattern.WeatherData.theoImplementation;

/**
 * Created by dj_di_000 on 14/6/2016.
 */
public class ForecastDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;

    private Subject weatherData;

    public ForecastDisplay(float temperature, float humidity, Subject weatherData) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.weatherData = weatherData;

        weatherData.registerObserver(this);
    }

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("\nForecast : \n");
        System.out.println("Temperature: "+temperature+"\nHumidity: "+humidity+"% \n");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;

        display();
    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        weatherData.unregisterObserver(this);
    }
}
