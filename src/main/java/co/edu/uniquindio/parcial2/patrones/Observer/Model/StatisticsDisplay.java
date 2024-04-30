package co.edu.uniquindio.parcial2.patrones.Observer.Model;

import co.edu.uniquindio.parcial2.patrones.Observer.Services.Observer;

public class StatisticsDisplay implements Observer {
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(WeatherData weatherData) {
        // Actualizar estadísticas con los nuevos datos climáticos
        System.out.println("Estadísticas actualizadas: " + weatherData.getTemperature() + "°C, "
                + weatherData.getHumidity() + "%, " + weatherData.getPressure() + " hPa");
    }
}


