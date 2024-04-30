package co.edu.uniquindio.parcial2.patrones.Observer.Model;

import co.edu.uniquindio.parcial2.patrones.Observer.Services.Observer;

public class ForecastDisplay implements Observer {
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(WeatherData weatherData) {
        // Actualizar pronóstico con los nuevos datos climáticos
        System.out.println("Pronóstico actualizado: ...");
    }
}
