package co.edu.uniquindio.parcial2.patrones.factoryMethod.model.extend;

import co.edu.uniquindio.parcial2.model.Empleado;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.EmpleadoP;

public class EmpleadoPermanente extends EmpleadoP {
    public EmpleadoPermanente(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
    }
    @Override
    public double calcularSalario() {
        // Lógica para calcular el salario de un empleado permanente
        return 2000; // Por ejemplo, un salario fijo de $2000
    }
}
