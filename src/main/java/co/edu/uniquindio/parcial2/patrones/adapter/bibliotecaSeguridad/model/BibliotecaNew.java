package co.edu.uniquindio.parcial2.patrones.adapter.bibliotecaSeguridad.model;

import co.edu.uniquindio.parcial2.patrones.adapter.bibliotecaSeguridad.service.AutenticacionMFA;

public class BibliotecaNew implements AutenticacionMFA {
    @Override
    public void autautenticacionOtp(String nombre, String contrasenia) {

        System.out.println("Procesando autotenticacion de otp" + monto + " a través de la autenticacionMFA de seguridad moderna");
    }
}
