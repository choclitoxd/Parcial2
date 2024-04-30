package co.edu.uniquindio.parcial2.patrones.factoryMethod.model;

public abstract class EmpleadoP {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    protected String edad;

    public EmpleadoP(String nombre, String apellido, String cedula, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }
    public abstract double calcularSalario();
}
