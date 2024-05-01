package co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno;

import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.Producto;
import co.edu.uniquindio.parcial2.patrones.factoryMethod.todoEnUno.model.ProductoFabrica;

public class main {
    public static void main(String[] args) {
        ProductoFabrica fabrica = new ProductoFabrica();
        Producto producto1 = fabrica.crearProducto("Coche");
        System.out.println("Nombre producto "+ producto1.getNombre()+", descripcion "+ producto1.getDescripcion() +"Mostrar precio= " + producto1.calcularPrecio());
    }
}
