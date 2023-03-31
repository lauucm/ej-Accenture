package model;

import java.time.LocalDate;

public class Producto {
    private LocalDate fCaducidad;
    private Integer numLote;

    public Producto(){
        this(LocalDate.ofEpochDay(0000-03-13), 0);
    }

    public Producto (LocalDate fCaducidad, Integer numLote){
        setfCaducidad(fCaducidad);
        setNumLote(numLote);
    }
    public LocalDate getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(LocalDate fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

    public Integer getNumLote() {
        return numLote;
    }

    public void setNumLote(Integer numLote) {
        this.numLote = numLote;
    }

    @Override
    public String toString() {
        return "Producto ->" +
                "Fecha de caducidad=" + fCaducidad +
                ", número de lote=" + numLote +
                '}';
    }
}