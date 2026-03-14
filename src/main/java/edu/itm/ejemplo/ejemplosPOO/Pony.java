package edu.itm.ejemplo.ejemplosPOO;

public class Pony extends Caballo{

    public Pony(String nombre) {
        super(nombre);
    }

    @Override
    public String traerEspecialidad() {
        return " ser bonito";
    }

    public void hacerSonido(){
        System.out.println(" el animal  "+getNombre()+"  ya no relincha ");
    }

}
