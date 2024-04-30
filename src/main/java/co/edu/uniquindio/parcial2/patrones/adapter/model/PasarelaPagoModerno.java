package co.edu.uniquindio.parcial2.patrones.adapter.model;

import co.edu.uniquindio.parcial2.patrones.adapter.service.Pago;

public class PasarelaPagoModerno implements Pago {
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de $" + monto + " a través de la pasarela de pagos moderna");
    }
}
