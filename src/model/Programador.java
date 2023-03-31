package model;

public class Programador extends Empleado{

    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;


    public Programador(){
        this(0, "", "", "", 0, false, 0.0);
    }

    public Programador(int lineasDeCodigoPorHora, String lenguajeDominante, String nombre, String cedula, Integer edad, boolean casado, Double salario){
        super(nombre, cedula, edad, casado, salario);
        setLineasDeCodigoPorHora(lineasDeCodigoPorHora);
        setLenguajeDominante(lenguajeDominante);
    }


    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lineas de código por hora= " + lineasDeCodigoPorHora +
                ", lenguaje dominante= " + lenguajeDominante + super.toString();

    }
}
