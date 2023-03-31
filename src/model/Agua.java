package model;

import java.time.LocalDate;

public class Agua extends Congelado{

    public Agua (LocalDate fCaducidad, Integer numLote, Double temp){
        super(temp, fCaducidad, numLote);
    }
}
