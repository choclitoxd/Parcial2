package co.edu.uniquindio.parcial2.model.builder;

import co.edu.uniquindio.parcial2.model.Cliente;
import co.edu.uniquindio.parcial2.model.Empleado;

public class ClienteBuilder extends PersonaBuilder<ClienteBuilder> {
    public Cliente build(){return new Cliente(nombre,apellido,cedula,edad);}
}
