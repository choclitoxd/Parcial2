package co.edu.uniquindio.parcial2.patrones.Observer.Services;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}