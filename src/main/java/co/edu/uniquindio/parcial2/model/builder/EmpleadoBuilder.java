package co.edu.uniquindio.parcial2.model.builder;

import co.edu.uniquindio.parcial2.model.Empleado;
import co.edu.uniquindio.parcial2.model.Persona;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.model.FabricarEmpleados;

public class EmpleadoBuilder extends PersonaBuilder<EmpleadoBuilder> {
    public Empleado build(){return new Empleado(nombre,apellido,cedula,edad);}
}
