package co.edu.uniquindio.parcial2.patrones.protoType.Model;

import co.edu.uniquindio.parcial2.patrones.protoType.Service.ICarro;

public class Carro implements ICarro {
    private String placa;
    private String tipo;
    public Carro(){
        tipo = "SEDAN";
    }

    @Override
    public ICarro clonar() {
        Carro carro = null;
        try {
            carro = (Carro) clone();
        }catch (CloneNotSupportedException e ){
            e.printStackTrace();
        }
        return carro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
