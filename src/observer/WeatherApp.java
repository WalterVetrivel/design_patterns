package observer;

public class WeatherApp {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(20, 60);
        Display display_1 = new Display("Display 1", weatherStation);
        Display display_2 = new Display("Display 2", weatherStation);
        weatherStation.addObserver(display_1);
        weatherStation.addObserver(display_2);
        weatherStation.setTemperature(21);
        weatherStation.removeObserver(display_1);
        weatherStation.setHumidity(65);
    }
}
