package designpatterns.observer.WeatherStation;

public class StatisticsDisplay implements Observer {
    private double minTemperature;
    private double maxTemperature;
    private double avgTemperature;
    private int count;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        count = 0;
        minTemperature = Double.MAX_VALUE;
        maxTemperature = Double.MIN_VALUE;
    }

    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) subject;
            double temp = weatherData.getTemperature();
            count++;
            minTemperature = Math.min(minTemperature, temp);
            maxTemperature = Math.max(maxTemperature, temp);
            avgTemperature = (avgTemperature * (count - 1) + temp) / count;
            display();
        }
    }

    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
    }
}
