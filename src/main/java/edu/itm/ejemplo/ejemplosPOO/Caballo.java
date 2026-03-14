package edu.itm.ejemplo.ejemplosPOO;

public abstract class Caballo extends Animal{

    private int numeroPatas = 4;

    public Caballo(String nombre) {
        super(nombre);
    }

    public abstract String traerEspecialidad();

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public void hacerSonido(){
        System.out.println(" el animal  "+getNombre()+"  relincha");
    }

}
