package model;

import java.time.LocalDate;

public class Nitrogeno extends Congelado{

    public Nitrogeno (LocalDate fCaducidad, Integer numLote, Double temp){
        super(temp, fCaducidad, numLote);
    }

}
