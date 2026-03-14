package edu.itm.ejemplo.ejemplosPOO;

public class PuraSangre extends Caballo{
    public PuraSangre(String nombre) {
        super(nombre);
    }

    @Override
    public String traerEspecialidad() {
        return "Correr";
    }
}
