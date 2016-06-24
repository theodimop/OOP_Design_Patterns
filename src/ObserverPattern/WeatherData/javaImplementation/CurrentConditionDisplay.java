package ObserverPattern.WeatherData.javaImplementation;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by dj_di_000 on 14/6/2016.
 */
public class CurrentConditionDisplay  implements Observer,DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private Observable observable;


    public CurrentConditionDisplay(Observable weatherData){
        observable =weatherData;
        observable.addObserver(this);
    }
    @Override
    public void display() {
        System.out.println("\nCurrent Condition \n");
        System.out.println("Temperature: "+temperature+"\nHumidity: "+humidity+"% \nPressure:"+pressure+"\n");

    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature= weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();

            this.display();
        }
    }

}
