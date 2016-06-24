package ObserverPattern.WeatherData.theoImplementation;

/**
 * Created by dj_di_000 on 14/6/2016.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println("\nCurrent Condition \n");
        System.out.println("Temperature: "+temperature+"\nHumidity: "+humidity+"% \nPressure:"+pressure+"\n");

    }

    @Override
    public void finalize() throws Throwable {
        super.finalize();
        weatherData.unregisterObserver(this);
    }
}
