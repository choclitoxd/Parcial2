package co.edu.uniquindio.parcial2.patrones.Observer;

import co.edu.uniquindio.parcial2.patrones.Observer.Model.ForecastDisplay;
import co.edu.uniquindio.parcial2.patrones.Observer.Model.StatisticsDisplay;
import co.edu.uniquindio.parcial2.patrones.Observer.Model.WeatherData;

public class main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

// Simulación de nuevos datos climáticos
        weatherData.setMeasurements(25.0, 70, 1020);
    }
}
