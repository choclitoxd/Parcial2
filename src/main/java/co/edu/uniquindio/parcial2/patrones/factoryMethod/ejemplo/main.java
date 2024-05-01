package co.edu.uniquindio.parcial2.patrones.factoryMethod.ejemplo;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.ejemplo.model.EmpleadoP;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.ejemplo.model.EmpleadoFabrica;

public class main {
    public static void main(String[] args) {
        EmpleadoFabrica fabrica = new EmpleadoFabrica();
        String nombre = "pepe";
        String apellido= "ramirez";
        String cedula = "121313";
        String edad = "12";

        // Creamos un empleado permanente
        EmpleadoP empleadoPermanente = fabrica.crearEmpleado("Permanente", "Juan", "Gomez", "123456", "30");
        System.out.println("Empleado permanente - Salario: $" + empleadoPermanente.calcularSalario());

        // Creamos un empleado temporal
        EmpleadoP empleadoTemporal = fabrica.crearEmpleado("Temporal", "Maria", "Lopez", "789012", "25");
        System.out.println("Empleado temporal - Salario: $" + empleadoTemporal.calcularSalario());
    }
}
