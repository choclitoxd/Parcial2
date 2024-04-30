package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.model.builder.ObjetoBuilder;
import co.edu.uniquindio.parcial2.model.builder.PrestamoBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {
    private String numeroPrestamo;
    private Date fechaPrestamo;
    private Date fechaEntrega;
    private String descripcion;
    private Cliente clienteAsociado;
    private Empleado empleadoAsociado;
    private List<Objeto> listaObjetos;

    public Prestamo(String numeroPrestamo, Date fechaPrestamo, Date fechaEntrega, String descripcion,Cliente clienteAsociado,Empleado empleadoAsociado) {
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
        this.clienteAsociado = clienteAsociado;
        this.empleadoAsociado = empleadoAsociado;
        this.listaObjetos = new ArrayList<>();
    }
    public static PrestamoBuilder builder(){
        return new PrestamoBuilder();
    }
    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public Empleado getEmpleadoAsociado() {
        return empleadoAsociado;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }
}
