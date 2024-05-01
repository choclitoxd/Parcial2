package co.edu.uniquindio.parcial2.patrones.command.delivery.Model;

import java.util.List;

public class DeliveryOrder {
    private String orderId;
    private String customerName;
    private String address;
    private List<Product> products;
    private OrderStatus status;

    public DeliveryOrder(String orderId, String customerName, String address, List<Product> products) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.address = address;
        this.products = products;
        this.status = OrderStatus.PENDING;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public List<Product> getProducts() {
        return products;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public enum OrderStatus {
        PENDING,
        IN_TRANSIT,
        DELIVERED
    }

}
