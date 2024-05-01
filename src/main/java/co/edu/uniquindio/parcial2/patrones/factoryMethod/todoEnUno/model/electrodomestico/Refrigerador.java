package co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.electrodomestico;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.Producto;

public class Refrigerador extends Producto {

    public Refrigerador(String nombre) {
        super(nombre,"Para eventos o uso doméstico temporal.");
    }
    @Override
    public String calcularPrecio() {
        return "600000";
    }
}
