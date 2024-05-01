package co.edu.uniquindio.parcial2.patrones.adapter.bibliotecaSeguridad.model;

import co.edu.uniquindio.parcial2.patrones.adapter.bibliotecaSeguridad.service.AutenticacionMFA;

import java.util.Random;

public class BibliotecaNew implements AutenticacionMFA {
    @Override
    public void autautenticacionOtp(String nombre, String contrasenia) {
        Random rand = new Random();
        int otp = rand.nextInt(9000) + 1000;
        System.out.println("Procesando autotenticacion de otp codigo = " + otp + " a través de la autenticacionMFA de seguridad moderna");
    }
}
