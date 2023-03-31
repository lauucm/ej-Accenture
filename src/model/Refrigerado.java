package model;

import java.time.LocalDate;

public class Refrigerado extends Producto {

    public Refrigerado (LocalDate fCaducidad, Integer numLote){
        super(fCaducidad, numLote);
    }
}
