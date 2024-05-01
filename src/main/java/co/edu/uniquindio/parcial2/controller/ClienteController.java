package co.edu.uniquindio.parcial2.controller;

import co.edu.uniquindio.parcial2.factory.ModelFactory;
import co.edu.uniquindio.parcial2.model.Cliente;
import co.edu.uniquindio.parcial2.model.Objeto;

import java.util.List;

public class ClienteController {
    ModelFactory modelFactory;

    public ClienteController() {
        modelFactory = ModelFactory.getInstance();
    }

    public List<Cliente> obtenerClientes() {
        return modelFactory.obtenerClientes();
    }
    public List<Cliente> clientePrestamoMayor(int rango){
        return modelFactory.prestamosClienteMayor(rango);
    }

    public String obtenerObjetosRango(int rango){
        return modelFactory.objetosMenosPrestados(rango);
    }

    public String obtenerClientePorCedula(String cedula) {
        return modelFactory.obtenerClientePorCedula(cedula);
    }

    public String obtenerEmpleadoConMasPrestamos(String rango) {
        return modelFactory.empleadosConMasPrestamos(rango);
    }

    public String obtenerPrestamosFecha(String fecha) {
        return modelFactory.obtenerPrestamosFecha(fecha);
    }

    public String EntreDosFechas(String fechaIni, String finalText) {
        return modelFactory.EntreDosFechas(fechaIni, finalText);
    }
}
