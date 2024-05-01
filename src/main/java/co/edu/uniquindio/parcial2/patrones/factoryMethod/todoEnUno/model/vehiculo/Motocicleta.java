package co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.vehiculo;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.Producto;

public class Motocicleta extends Producto {
    public Motocicleta(String nombre) {
        super(nombre,"Ideal para clientes que buscan un transporte ágil");
    }

    @Override
    public String calcularPrecio() {
        return "700000";
    }
}
