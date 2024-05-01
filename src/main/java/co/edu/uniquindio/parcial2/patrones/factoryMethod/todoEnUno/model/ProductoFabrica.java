package co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model;


import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.electrodomestico.Lavadora;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.electrodomestico.Refrigerador;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.electrodomestico.Televisor;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.vehiculo.Bicicleta;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.vehiculo.Coche;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.vehiculo.Motocicleta;

public class ProductoFabrica {
    public Producto crearProducto(String nombre) {
        if(nombre.equalsIgnoreCase("Coche")) {
            return new Coche(nombre);
        }else if (nombre.equalsIgnoreCase("Motocicleta")) {
            return new Motocicleta(nombre);
        } else if (nombre.equalsIgnoreCase("Bicicleta")) {
            return new Bicicleta(nombre);
        } else if (nombre.equalsIgnoreCase("Lavadora")) {
            return new Lavadora(nombre);
        } else if (nombre.equalsIgnoreCase("Refrigerador")) {
            return new Refrigerador(nombre);
        } else if (nombre.equalsIgnoreCase("Televisor")) {
            return new Televisor(nombre);

        } else {
            throw new IllegalArgumentException("Tipo de producto no válido");
        }
    }
}
