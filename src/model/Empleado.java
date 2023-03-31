package model;

public class Empleado {
    private String nombre;
    private String cedula;
    private Integer edad;
    private boolean casasdo;
    private Double salario;

    public Empleado (){
        this("", "", 0, false, 0.0);
    }

    public Empleado (String nombre, String cedula, Integer edad, boolean casado, Double salario){
        setNombre(nombre);
        setCedula(cedula);
        setEdad(edad);
        setCasasdo(casado);
        setSalario(salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        if(edad < 18 || edad > 45){
            throw new IllegalArgumentException("La edad debe estar entre 18 y 45 años");
        } else {
            this.edad = edad;
        }

    }

    public boolean isCasasdo() {
        return casasdo;
    }

    public void setCasasdo(boolean casasdo) {
        this.casasdo = casasdo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void clasificarEdad(){
        if(edad <= 21){
            System.out.println("Principiante");
        } else if (edad >= 22 && edad <= 35 ){
            System.out.println("Intermedio");
        } else {
            System.out.println("Senior");
        }
    }

    public void aumentarSalario(Double porcentaje){
        double aumento = salario * (porcentaje /100.0);
        salario += aumento;
        System.out.println("El salario ha sido aumentado en: " + porcentaje + "%. Nuevo salario: " + salario);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "\nnombre='" + nombre +
                "\ncedula='" + cedula +
                "\nedad=" + edad +
                "\ncasasdo=" + casasdo +
                "\nsalario=" + salario ;
    }
}
