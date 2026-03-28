package edu.itm.ejemplo.ejemplosinicialesdeclase.ejemploProgramacionFuncional.ejemplosPOO;

public class Moto implements Vehiculo{
    public Moto(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    private int numeroRuedas;

    @Override
    public void conducir() {
        System.out.println(" voy en pura en mi motico ");
    }

    @Override
    public int obtenerNumeroRuedas() {
        return getNumeroRuedas();
    }

    public int getNumeroRuedas() {
        return numeroRuedas;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }
}
