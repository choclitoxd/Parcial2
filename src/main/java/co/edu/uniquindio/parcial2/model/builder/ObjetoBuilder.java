package co.edu.uniquindio.parcial2.model.builder;

import co.edu.uniquindio.parcial2.model.Objeto;
import co.edu.uniquindio.parcial2.model.Prestamo;

public class ObjetoBuilder {
    protected String codigoObjeto;
    protected String nombreObjeto;
    protected Prestamo prestamoAsociado;
    public ObjetoBuilder codigoObjeto(String codigoObjeto){
        this.codigoObjeto = codigoObjeto;
        return this;
    }
    public ObjetoBuilder nombreObjeto(String nombreObjeto){
        this.nombreObjeto = nombreObjeto;
        return this;
    }
    public ObjetoBuilder prestamoAsociado(Prestamo prestamoAsociado){
        this.prestamoAsociado = prestamoAsociado;
        return this;
    }
    public Objeto build(){
        return  new Objeto(codigoObjeto,nombreObjeto,prestamoAsociado);
    }

}
