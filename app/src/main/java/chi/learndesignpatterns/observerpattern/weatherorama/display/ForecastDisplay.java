package chi.learndesignpatterns.observerpattern.weatherorama.display;

import java.util.Observable;
import java.util.Observer;

import chi.learndesignpatterns.observerpattern.weatherorama.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer {

    private Observable observable;

    private float currentPressure = 29.92F;

    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("More of the same");
        } else if (currentPressure < lastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}
