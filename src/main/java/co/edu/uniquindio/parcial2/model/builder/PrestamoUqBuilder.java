package co.edu.uniquindio.parcial2.model.builder;

import co.edu.uniquindio.parcial2.model.PrestamoUq;

public class PrestamoUqBuilder {
    protected String nombrePrestamoUq;
    public PrestamoUqBuilder nombrePrestamoUq(String nombrePrestamoUq){
        this.nombrePrestamoUq =nombrePrestamoUq;
        return this;
    }
    public PrestamoUq build(){
        return new PrestamoUq(nombrePrestamoUq);
    }
}
