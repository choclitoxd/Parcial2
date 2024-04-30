package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.model.builder.ClienteBuilder;
import co.edu.uniquindio.parcial2.model.builder.PrestamoUqBuilder;

import java.util.ArrayList;
import java.util.List;

public class PrestamoUq {
    private String nombre;
    private List<Cliente> listaClientes;
    private List<Prestamo> listaPrestamo;
    private List<Empleado> listaEmpleados;
    private List<Objeto> listaObjetos;

    public PrestamoUq(String nombre) {
        this.nombre = nombre;
        listaClientes = new ArrayList<>();
        listaPrestamo = new ArrayList<>();
        listaEmpleados = new ArrayList<>();
        listaObjetos = new ArrayList<>();
    }
    public static PrestamoUqBuilder builder(){
        return new PrestamoUqBuilder();
    }

    public boolean crearCliente;

    public String getNombre() {
        return nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Prestamo> getListaPrestamo() {
        return listaPrestamo;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public List<Objeto> getListaObjetos() {
        return listaObjetos;
    }
    public  List<Objeto> objetosPrestadosMayor(int rango){
        List<Objeto> listObjetoPrestadoRango = new ArrayList<>();

        for (Objeto objeto:listaObjetos){
            int contadoeObjetoPrestado = 0;
            for (Prestamo prestamo: listaPrestamo){
                for (Objeto objetoPrestado:prestamo.getListaObjetos()){
                    if (objeto.getNombreObjeto().equals(objetoPrestado.getNombreObjeto())){
                        contadoeObjetoPrestado++;
                    }
                }
            }
            if (contadoeObjetoPrestado > rango){
                listObjetoPrestadoRango.add(objeto);
            }
        }
        return  listObjetoPrestadoRango;

    }
    public List<Cliente>prestamosClienteMayor(int rango){
        List<Cliente>listaCLientePrestamo = new ArrayList<>();
        for (Cliente cliente:listaClientes){
            int contadorPrestamo = 0;
            for (Prestamo prestamo:listaPrestamo){
                if (cliente.equals(prestamo.getClienteAsociado())){
                    contadorPrestamo++;
                }
            }
            if (contadorPrestamo>rango){
                listaCLientePrestamo.add(cliente);
            }
        }
        return listaCLientePrestamo;
    }
}
