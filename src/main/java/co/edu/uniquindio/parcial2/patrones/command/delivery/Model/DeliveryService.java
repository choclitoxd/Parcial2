package co.edu.uniquindio.parcial2.patrones.command.delivery.Model;

public class DeliveryService {
    public void processDelivery(DeliveryOrder order) {
        // Lógica para procesar la entrega del pedido
        System.out.println("Procesando entrega del pedido: " + order.getOrderId());
        // ...
    }
}
