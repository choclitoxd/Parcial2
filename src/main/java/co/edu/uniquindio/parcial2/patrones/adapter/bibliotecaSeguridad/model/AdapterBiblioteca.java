package co.edu.uniquindio.parcial2.patrones.adapter.bibliotecaSeguridad.model;

import co.edu.uniquindio.parcial2.patrones.adapter.pasarelaPago.model.PasarelaPagoModerno;

public class AdapterBiblioteca {
    private BibliotecaNew bibliotecaNew;
    public AdapterBiblioteca (BibliotecaNew bibliotecaNew) {
        this.bibliotecaNew = bibliotecaNew;
    }
    public void autautenticacionOtp(String nombre,String contrasenia){
        bibliotecaNew.autautenticacionOtp(nombre,contrasenia);
    }
}
