package co.edu.uniquindio.parcial2.patrones.Observer.Services;

import co.edu.uniquindio.parcial2.patrones.Observer.Model.WeatherData;

public interface Observer {
    void update(WeatherData weatherData);
}