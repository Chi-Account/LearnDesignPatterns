package chi.learndesignpatterns.observerpattern.weatherorama.display;

import java.util.Observable;
import java.util.Observer;

import chi.learndesignpatterns.observerpattern.weatherorama.WeatherData;

public class StatisticsDisplay implements DisplayElement, Observer {

    private Observable observable;

    private float maxTemperature = Float.MIN_VALUE;

    private float minTemperature = Float.MAX_VALUE;

    private float temperatureSum = 0F;

    private float temperatureCount = 0;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Ave/Max/Min temperature = " + (temperatureSum / temperatureCount) + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            float temperature = weatherData.getTemperature();
            maxTemperature = Math.max(temperature, maxTemperature);
            minTemperature = Math.min(temperature, minTemperature);
            temperatureSum += temperature;
            temperatureCount++;
            display();
        }
    }
}
