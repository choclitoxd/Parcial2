package co.edu.uniquindio.parcial2.patrones.adapter;

import co.edu.uniquindio.parcial2.patrones.adapter.model.AdapterPago;
import co.edu.uniquindio.parcial2.patrones.adapter.model.PasarelaPagoModerno;

public class main {
    public static void main(String[] args) {
        PasarelaPagoModerno pasarelaModerna = new PasarelaPagoModerno();
        AdapterPago adaptador = new AdapterPago(pasarelaModerna);
        adaptador.procesarPago(100.0);
    }
}
