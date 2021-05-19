package chi.learndesignpatterns.observerpattern.weatherorama;

import chi.learndesignpatterns.observerpattern.weatherorama.display.CurrentConditionsDisplay;
import chi.learndesignpatterns.observerpattern.weatherorama.display.ForecastDisplay;
import chi.learndesignpatterns.observerpattern.weatherorama.display.HeatIndexDisplay;
import chi.learndesignpatterns.observerpattern.weatherorama.display.StatisticsDisplay;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4F);
        weatherData.setMeasurements(82, 70, 29.2F);
        weatherData.setMeasurements(78, 90, 29.2F);
    }
}
