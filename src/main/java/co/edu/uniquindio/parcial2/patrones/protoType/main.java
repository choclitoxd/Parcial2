package co.edu.uniquindio.parcial2.patrones.protoType;

import co.edu.uniquindio.parcial2.patrones.protoType.Model.Carro;

public class main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.setPlaca("qeqw");

        Carro carro2 = new Carro();

        Carro carroClonado = (Carro) carro2.clonar();

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carroClonado);
    }
}
