package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    private List<IObserver> displays = new ArrayList();
    private int temperature;
    private int humidity;

    public WeatherStation(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public void addObserver(IObserver observer) {
        this.displays.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.displays.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver display:displays) {
            display.updateObserver();
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyObservers();
    }
}
