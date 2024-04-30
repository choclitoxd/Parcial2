package co.edu.uniquindio.parcial2.patrones.factoryMethod.model.extend;

import co.edu.uniquindio.parcial2.model.Empleado;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.EmpleadoP;

public class EmpleadoTemporal extends EmpleadoP {
    public EmpleadoTemporal(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
    }
    @Override
    public double calcularSalario() {
        return 32000;
    }

}
