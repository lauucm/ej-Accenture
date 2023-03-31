package model;

import java.time.LocalDate;

public class Aire extends Congelado{
    public Aire(LocalDate fCaducidad, Integer numLote, Double temp){
        super(temp, fCaducidad, numLote);
    }
}
