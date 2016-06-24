package ObserverPattern.WeatherData.theoImplementation;

/**
 * Created by dj_di_000 on 14/6/2016.
 */
public interface Subject {
    void registerObserver(Observer o);
    void unregisterObserver(Observer o );
    void notifyObservers();


}
