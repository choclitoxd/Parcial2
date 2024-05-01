package co.edu.uniquindio.parcial2.patrones.adapter.bibliotecaSeguridad;

import co.edu.uniquindio.parcial2.patrones.adapter.bibliotecaSeguridad.model.AdapterBiblioteca;
import co.edu.uniquindio.parcial2.patrones.adapter.bibliotecaSeguridad.model.BibliotecaNew;
import co.edu.uniquindio.parcial2.patrones.adapter.pasarelaPago.model.AdapterPago;
import co.edu.uniquindio.parcial2.patrones.adapter.pasarelaPago.model.PasarelaPagoModerno;

public class main {
    public static void main(String[] args) {
        BibliotecaNew bibliotecaNew = new BibliotecaNew();
        AdapterBiblioteca adaptador = new AdapterBiblioteca(bibliotecaNew);
        adaptador.autautenticacionOtp("Manula","Sebas");
    }
}
