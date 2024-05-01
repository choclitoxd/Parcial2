package co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model;

public abstract class Producto {
    protected String nombre;
    protected String descripcion;

    public Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}
