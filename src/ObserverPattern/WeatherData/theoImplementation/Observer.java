package ObserverPattern.WeatherData.theoImplementation;

/**
 * Created by dj_di_000 on 14/6/2016.
 */
public interface Observer {
    void update(float temperature,float humidity,float pressure);
}
