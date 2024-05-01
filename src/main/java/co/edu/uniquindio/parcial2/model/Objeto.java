package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.model.builder.EmpleadoBuilder;
import co.edu.uniquindio.parcial2.model.builder.ObjetoBuilder;

public class Objeto {
    private String codigoObjeto;
    private String nombreObjeto;
    private Prestamo prestamoAsociado;
    public Objeto(String codigoObjeto,String nombreObjeto,Prestamo prestamoAsociado) {
        this.codigoObjeto = codigoObjeto;
        this.nombreObjeto = nombreObjeto;
        this.prestamoAsociado = prestamoAsociado;
    }
    public static ObjetoBuilder builder(){
        return new ObjetoBuilder();
    }

    public String getCodigoObjeto() {
        return codigoObjeto;
    }

    public Prestamo getPrestamoAsociado() {
        return prestamoAsociado;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    @Override
    public String toString() {
        return "codigo='" + codigoObjeto + '\'' +
                ", nombre='" + nombreObjeto ;
    }
}
