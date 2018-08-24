package observer;

public class Display implements IObserver {
    private WeatherStation weatherStation;
    private String displayName;
    private String displayedTemperature;
    private String displayedHumidity;

    public Display(String displayName, WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
        this.displayName = displayName;
        displayedTemperature = String.valueOf(this.weatherStation.getTemperature());
        displayedHumidity = String.valueOf(this.weatherStation.getHumidity());
    }

    @Override
    public void updateObserver() {
        displayedTemperature = String.valueOf(weatherStation.getTemperature());
        displayedHumidity = String.valueOf(weatherStation.getHumidity());
        display();
    }

    public void display() {
        System.out.println("Weather data on " + displayName + ":");
        System.out.println("Temperature: " + displayedTemperature);
        System.out.println("Humidity: " + displayedHumidity);
        System.out.println();
    }
}
