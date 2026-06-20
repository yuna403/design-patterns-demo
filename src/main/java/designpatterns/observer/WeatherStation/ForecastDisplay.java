package designpatterns.observer.WeatherStation;

public class ForecastDisplay implements Observer {
    private double forecastTemperature;
    private double forecastHumidity;
    private double forecastPressure;

    public ForecastDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData weatherData) {
            forecastTemperature = weatherData.getTemperature() + 0.11 * weatherData.getHumidity() - 0.25 * weatherData.getPressure();
            forecastHumidity = weatherData.getHumidity() - 0.09 * weatherData.getHumidity();
            forecastPressure = weatherData.getPressure() + 0.18 * weatherData.getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("Forecast: Temperature = " + forecastTemperature + "F, Humidity = " + forecastHumidity + "%, Pressure = " + forecastPressure);
    }
}
