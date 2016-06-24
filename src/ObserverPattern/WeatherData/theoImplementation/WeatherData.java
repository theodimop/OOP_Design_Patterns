package ObserverPattern.WeatherData.theoImplementation;

import java.util.ArrayList;

/**
 * Created by dj_di_000 on 14/6/2016.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers= new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public void unregisterObserver(Observer o) {
        int index = observers.indexOf(o);
        if(index>-1){
            observers.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature,humidity,pressure));
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;

        //When Measurements are set notify the observers
        measurementChanged();
    }

}
