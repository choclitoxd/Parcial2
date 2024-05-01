package co.edu.uniquindio.parcial2.patrones.adapter.pasarelaPago.model;

public class AdapterPago {
    private PasarelaPagoModerno pasarela;

    public AdapterPago(PasarelaPagoModerno pasarela) {
        this.pasarela = pasarela;
    }

    public void procesarPago(double monto) { pasarela.procesarPago(monto);
    }
}
