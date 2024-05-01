package co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.vehiculo;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.Producto;

public class Coche extends Producto {
    public Coche(String nombre) {
        super(nombre, "Para uso personal o viajes de negocios");
    }
    @Override
    public String calcularPrecio() {
        return "12000000";
    }
}
