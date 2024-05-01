package co.edu.uniquindio.parcial2.model;

import co.edu.uniquindio.parcial2.model.builder.PrestamoUqBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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

    public  String objetosMenosPrestados(int rango){
        String listObjetoPrestadoRango = "";

        for (Objeto objeto:listaObjetos){
            int contadoeObjetoPrestado = 0;
            for (Prestamo prestamo: listaPrestamo){
                for (Objeto objetoPrestado:prestamo.getListaObjetos()){
                    if (objeto.getNombreObjeto().equals(objetoPrestado.getNombreObjeto())){
                        contadoeObjetoPrestado++;
                    }
                }
            }
            if (contadoeObjetoPrestado <= rango){
                listObjetoPrestadoRango += objeto.toString() + "\n";
            }
        }
        return  listObjetoPrestadoRango;

    }

    public String obtenerClientePorCedula(String cedula) {
        String clientesPorCedula = "";

        for (Cliente cliente:listaClientes){
            if (cedula.equalsIgnoreCase(cliente.getCedula())){
                clientesPorCedula += cliente.toString() + "\n";
            }
        }

        return clientesPorCedula;
    }

    public String prestamosConMasPrestamos(String rango) {
        String listaEmpleadosConMasPrestamos = "";

        for (Empleado empleado:listaEmpleados){
            int contadorPrestamo = 0;
            for (Prestamo prestamo:listaPrestamo){
                if (empleado.equals(prestamo.getEmpleadoAsociado())){
                    contadorPrestamo++;
                }
            }
            if (contadorPrestamo >= Integer.parseInt(rango)){
                listaEmpleadosConMasPrestamos += empleado.toString() + "\n";
            }
        }
        return listaEmpleadosConMasPrestamos;
    }

    public String obtenerPrestamosFecha(String fecha) {

        List<Integer> listaPartesFecha = new ArrayList<>();
        listaPartesFecha = Arrays.stream(fecha.split("/")).sequential().map(Integer::parseInt).toList();

        Date fechaCompare = new Date(listaPartesFecha.get(0)-1900, listaPartesFecha.get(1), listaPartesFecha.get(2));

        for (Prestamo prestamo:listaPrestamo){
            if (prestamo.getFechaPrestamo().equals(fechaCompare)) {
                return prestamo.toString();
            }
        }

        return null;
    }

    public String EntreDosFechas(String fechaIni, String finalText) {
        String mensaje = "";
        List<Integer> listaPartesFecha1 = new ArrayList<>();
        listaPartesFecha1 = Arrays.stream(fechaIni.split("/")).sequential().map(Integer::parseInt).toList();
        List<Integer> listaPartesFecha2 = new ArrayList<>();
        listaPartesFecha2 = Arrays.stream(finalText.split("/")).sequential().map(Integer::parseInt).toList();

        Date fechaCompare1 = new Date(listaPartesFecha1.get(0)-1900, listaPartesFecha1.get(1), listaPartesFecha1.get(2));
        Date fechaCompare2 = new Date(listaPartesFecha2.get(0)-1900, listaPartesFecha2.get(1), listaPartesFecha2.get(2));

        for (Prestamo prestamo:listaPrestamo){
            if (prestamo.getFechaPrestamo().before(fechaCompare2) && prestamo.getFechaPrestamo().after(fechaCompare1)) {
                mensaje += prestamo.toString() + "\n";
            }
        }
        return mensaje;
    }
}
