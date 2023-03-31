package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class Envio {
    private List<Congelado> congelados;
    private List<Fresco> frescos;
    private List<Refrigerado> refrigerados;

    public Envio(){
        congelados = new ArrayList<Congelado>();
        frescos = new ArrayList<Fresco>();
        refrigerados = new ArrayList<Refrigerado>();
    }

    public List<Congelado> getCongelados() {
        return congelados;
    }

    public void setCongelados(List<Congelado> congelados) {
        this.congelados = congelados;
    }

    public List<Fresco> getFrescos() {
        return frescos;
    }

    public void setFrescos(List<Fresco> frescos) {
        this.frescos = frescos;
    }

    public List<Refrigerado> getRefrigerados() {
        return refrigerados;
    }

    public void setRefrigerados(List<Refrigerado> refrigerados) {
        this.refrigerados = refrigerados;
    }

    public void addCongelados(Congelado producto){
        this.congelados.add(producto);
    }

    public void addFrescos(Fresco producto){
        this.frescos.add(producto);
    }

    public void addRefrigerados(Refrigerado producto){
        this.refrigerados.add(producto);
    }

    public void deleteRefrigerados(Refrigerado producto){
        this.refrigerados.remove(producto);
    }
    public void deleteCongelados(Congelado producto){
        this.congelados.remove(producto);
    }

    public void deleteFrescos(Fresco producto){
        this.frescos.remove(producto);
    }

}


