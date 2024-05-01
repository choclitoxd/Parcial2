package co.edu.uniquindio.parcial2.patrones.factoryMethod.ejemplo.model;

public abstract class FabricarEmpleados {
    public abstract EmpleadoP crearEmpleado(String tipoEmpleado, String nombre, String apellido, String cedula, String edad);
}
