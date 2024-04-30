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
}
