package model;

import java.time.LocalDate;

public class Congelado extends Producto{
    private Double temp;

    public Congelado (){
    }

    public Congelado(Double temp, LocalDate fCaducidad, Integer numLote){
        super(fCaducidad, numLote);
        setTemp(temp);
    }
    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
}
