package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.model.builder.ObjetoBuilder;
import co.edu.uniquindio.parcial2.model.builder.PersonaBuilder;

public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String edad;
    public Persona(String nombre, String apellido, String cedula, String edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEdad() {
        return edad;
    }
    public static PersonaBuilder builder(){
        return new PersonaBuilder();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cedula='" + cedula + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }
}
