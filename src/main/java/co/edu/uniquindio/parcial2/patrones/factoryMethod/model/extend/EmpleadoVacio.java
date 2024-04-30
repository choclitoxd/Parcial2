package co.edu.uniquindio.parcial2.patrones.factoryMethod.model.extend;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.EmpleadoP;

public class EmpleadoVacio extends EmpleadoP {

    public EmpleadoVacio(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
    }

    @Override
    public double calcularSalario() {
        return 0;
    }
}
