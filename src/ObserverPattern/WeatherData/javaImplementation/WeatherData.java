package ObserverPattern.WeatherData.javaImplementation;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by dj_di_000 on 14/6/2016.
 */
public class WeatherData extends Observable {

    private ArrayList<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers= new ArrayList<>();
    }

    public void measurementChanged(){
        setChanged();
        //We dont send objects to observers,
        //We will use the pull method
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;

        //When Measurements are set notify the observers
        measurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
