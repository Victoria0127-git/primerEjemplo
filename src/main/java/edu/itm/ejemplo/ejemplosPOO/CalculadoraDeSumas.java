package edu.itm.ejemplo.ejemplosPOO;

public class CalculadoraDeSumas {

    public int sumar(int a, int b){
        return a + b;
    }

    public int sumar(int a, int b, int c){
        return a + b + c;
    }

    public float sumar(float a, float b){
        System.out.println("suma dos float ");
        return a + b;
    }

    public double sumar(double a, double b){
        System.out.println("suma dos doble ");
        return a + b;
    }

}
