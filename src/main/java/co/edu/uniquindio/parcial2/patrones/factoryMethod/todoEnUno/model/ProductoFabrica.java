package co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model;



public class ProductoFabrica {
    public Producto crearEmpleado(String categoria,int numero) {
        if(tipoEmpleado.equalsIgnoreCase("Permanente")) {
            return  new EmpleadoPermanente(nombre, apellido, cedula, edad);
        } else if (tipoEmpleado.equalsIgnoreCase("Temporal")) {
            return new EmpleadoTemporal(nombre, apellido, cedula, edad);
        } else {
            throw new IllegalArgumentException("Tipo de empleado no válido");
        }
    }
}
