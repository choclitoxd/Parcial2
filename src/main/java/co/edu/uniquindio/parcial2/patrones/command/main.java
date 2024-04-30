package co.edu.uniquindio.parcial2.patrones.command;

import co.edu.uniquindio.parcial2.patrones.command.Model.*;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Producto A", 10.99));
        products.add(new Product("Producto B", 15.49));

        DeliveryOrder order1 = new DeliveryOrder("ORD001", "Juan Pérez", "Calle Principal 123", products);
        DeliveryOrder order2 = new DeliveryOrder("ORD002", "Leo","Avenida Central 456", products);

        DeliveryService deliveryService = new DeliveryService();
        DeliveryCommandInvoker invoker = new DeliveryCommandInvoker();

        invoker.addCommand(new DeliveryCommand(order1, deliveryService));
        invoker.addCommand(new DeliveryCommand(order2, deliveryService));

        invoker.executeCommands();
    }
}
