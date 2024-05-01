package co.edu.uniquindio.parcial2.patrones.factoryMethod.ejemplo.model.extend;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.ejemplo.model.EmpleadoP;

public class EmpleadoTemporal extends EmpleadoP {
    public EmpleadoTemporal(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
    }
    @Override
    public double calcularSalario() {
        return 32000;
    }

}
