package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.model.builder.ClienteBuilder;
import co.edu.uniquindio.parcial2.model.builder.EmpleadoBuilder;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona{
    private List<Prestamo> listPrestamosAsociados;
    public Cliente(String nombre, String apellido, String cedula, String edad) {
        super(nombre, apellido, cedula, edad);
        listPrestamosAsociados = new ArrayList<>();
    }
    public static ClienteBuilder builder(){
        return new ClienteBuilder();
    }
    public List<Prestamo> getListPrestamosAsociados() {
        return listPrestamosAsociados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "listPrestamosAsociados=" + listPrestamosAsociados +
                "} " + super.toString();
    }
}
