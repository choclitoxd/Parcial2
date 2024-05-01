package co.edu.uniquindio.parcial2.patrones.factoryMethod.ejemplo.model;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.ejemplo.model.extend.EmpleadoPermanente;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.ejemplo.model.extend.EmpleadoTemporal;

public class EmpleadoFabrica extends FabricarEmpleados {
    @Override
    public EmpleadoP crearEmpleado(String tipoEmpleado, String nombre, String apellido, String cedula, String edad) {
        if(tipoEmpleado.equalsIgnoreCase("Permanente")) {
            return  new EmpleadoPermanente(nombre, apellido, cedula, edad);
        } else if (tipoEmpleado.equalsIgnoreCase("Temporal")) {
            return new EmpleadoTemporal(nombre, apellido, cedula, edad);
        } else {
            throw new IllegalArgumentException("Tipo de empleado no válido");
        }
    }
}
