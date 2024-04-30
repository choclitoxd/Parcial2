package co.edu.uniquindio.parcial2.factory;

import co.edu.uniquindio.parcial2.model.*;

import java.util.Date;
import java.util.List;

public class ModelFactory {
    private static ModelFactory modelFactory;

    private PrestamoUq prestamoUq;


    private ModelFactory(){
        prestamoUq = PrestamoUq.builder().nombrePrestamoUq("Prestamo").build();
        inicializarDatos();
    }
    public static ModelFactory getInstance() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    private void inicializarDatos() {
        Date fechaHoy = new Date();
        Cliente cliente1 = Cliente.builder()
                .nombre("jean")
                .apellido("leon")
                .cedula("1021212")
                .edad("19")
                .build();
        Empleado empleado1 = Empleado.builder()
                .nombre("Sebas")
                .apellido("Amaya")
                .cedula("1096212331")
                .edad("18")
                .build();
        Prestamo prestamo1 = Prestamo.builder()
                .numeroPrestamo("1")
                .fechaPrestamo(fechaHoy)
                .fechaEntrega(new Date(fechaHoy.getYear(),04,28))
                .descripcion("Melo")
                .clienteAsociado(cliente1)
                .empleadoAsociado(empleado1)
                .build();
        Objeto objeto1 = Objeto.builder()
                .codigoObjeto("012QE")
                .nombreObjeto("play")
                .prestamoAsociado(prestamo1)
                .build();
        prestamo1.getListaObjetos().add(objeto1);
        prestamoUq.getListaPrestamo().add(prestamo1);
        prestamoUq.getListaEmpleados().add(empleado1);
        prestamoUq.getListaClientes().add(cliente1);
        prestamoUq.getListaObjetos().add(objeto1);
        Cliente cliente2 = Cliente.builder()
                .nombre("María")
                .apellido("Gómez")
                .cedula("2041223")
                .edad("25")
                .build();
        Empleado empleado2 = Empleado.builder()
                .nombre("Juan")
                .apellido("Pérez")
                .cedula("112344556")
                .edad("30")
                .build();
        Prestamo prestamo2 = Prestamo.builder()
                .numeroPrestamo("2")
                .fechaPrestamo(fechaHoy)
                .fechaEntrega(new Date(fechaHoy.getYear(), 4, 30)) // Cambiado a 30 de abril
                .descripcion("Libro de matemáticas")
                .empleadoAsociado(empleado2)
                .clienteAsociado(cliente2)
                .build();
        Objeto objeto2 = Objeto.builder()
                .codigoObjeto("01213Q")
                .nombreObjeto("control")
                .prestamoAsociado(prestamo2)
                .build();
        prestamo2.getListaObjetos().add(objeto2);
        prestamoUq.getListaPrestamo().add(prestamo2);
        prestamoUq.getListaEmpleados().add(empleado2);
        prestamoUq.getListaClientes().add(cliente2);
        prestamoUq.getListaObjetos().add(objeto2);
        Cliente cliente3 = Cliente.builder()
                .nombre("Pedro")
                .apellido("González")
                .cedula("3098765")
                .edad("35")
                .build();
        Empleado empleado3 = Empleado.builder()
                .nombre("Ana")
                .apellido("Martínez")
                .cedula("5678901")
                .edad("28")
                .build();
        Prestamo prestamo3 = Prestamo.builder()
                .numeroPrestamo("3")
                .fechaPrestamo(fechaHoy)
                .fechaEntrega(new Date(fechaHoy.getYear(), 5, 5))
                .descripcion("Tablet para presentación")
                .clienteAsociado(cliente3)
                .empleadoAsociado(empleado3)
                .build();
        Objeto objeto3 = Objeto.builder()
                .codigoObjeto("02213Q")
                .nombreObjeto("table")
                .build();
        prestamoUq.getListaObjetos().add(objeto3);
        prestamo3.getListaObjetos().add(objeto1);
        prestamo3.getListaObjetos().add(objeto2);
        prestamoUq.getListaPrestamo().add(prestamo3);
        prestamoUq.getListaEmpleados().add(empleado3);
        prestamoUq.getListaClientes().add(cliente3);
        Empleado empleado4 = Empleado.builder()
                .nombre("Carlos")
                .apellido("Sánchez")
                .cedula("6789012")
                .edad("40")
                .build();
        Prestamo prestamo4 = Prestamo.builder()
                .numeroPrestamo("4")
                .fechaPrestamo(fechaHoy)
                .fechaEntrega(new Date(fechaHoy.getYear(), 5, 10))
                .descripcion("Cámara fotográfica profesional")
                .clienteAsociado(cliente3)
                .empleadoAsociado(empleado4)
                .build();
        prestamo4.getListaObjetos().add(objeto2);
        prestamoUq.getListaPrestamo().add(prestamo4);
        prestamoUq.getListaEmpleados().add(empleado4);
        Cliente cliente5 = Cliente.builder()
                .nombre("Laura")
                .apellido("Rodríguez")
                .cedula("5098765")
                .edad("29")
                .build();
        Empleado empleado5 = Empleado.builder()
                .nombre("Miguel")
                .apellido("López")
                .cedula("7890123")
                .edad("33")
                .build();
        Prestamo prestamo5 = Prestamo.builder()
                .numeroPrestamo("5")
                .fechaPrestamo(fechaHoy)
                .fechaEntrega(new Date(fechaHoy.getYear(), 5, 15))
                .descripcion("Herramientas de jardinería")
                .clienteAsociado(cliente5)
                .empleadoAsociado(empleado5)
                .build();
        prestamo5.getListaObjetos().add(objeto1);
        prestamoUq.getListaPrestamo().add(prestamo5);
        prestamoUq.getListaEmpleados().add(empleado5);
        prestamoUq.getListaClientes().add(cliente5);
    }
    public List<Objeto> obtenerObjeto(){
        return prestamoUq.getListaObjetos();
    }
    public List<Objeto> objetosPrestados(int rango){
        return prestamoUq.objetosPrestadosMayor(rango);
    }


    public List<Cliente> obtenerClientes() {
        return prestamoUq.getListaClientes();
    }
    public List<Cliente> prestamosClienteMayor(int rango){
        return prestamoUq.prestamosClienteMayor(rango);
    }
}
