package edu.itm.ejemplo.ejemplosCollecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicado permitido
        fruits.add("otra vaina");

        System.out.println(fruits); // Salida: [Apple, Banana, Apple]
        System.out.println(fruits.get(1));// Acceso por índice: Salida: Banana

        for(String s : fruits){
            System.out.println(s);
        }

        ArrayList<String> moreFruits = new ArrayList<>();
        moreFruits.add("Apple");
        moreFruits.add("Banana");
        moreFruits.add("Orange");

        // Acceso por índice
        System.out.println("First fruit: " + moreFruits.get(0)); // Salida: Apple
//todos
        System.out.println(moreFruits);

        // Inserción al final
        moreFruits.add("Mango");

        // Eliminación del último elemento
        moreFruits.remove(moreFruits.size() - 1); // Elimina Mango

        moreFruits.add("algarroba");


        // Recorrer el ArrayList
        for (String fruit : moreFruits) {
            System.out.println(fruit);
        }

        //implementación de una lista doblemente ligada

        LinkedList<String> fruitsListaLigada = new LinkedList<>();

        // Agregar elementos a la LinkedList
        fruitsListaLigada.add("Apple");
        fruitsListaLigada.add("Banana");
        fruitsListaLigada.add("Orange");
        fruitsListaLigada.add("Mango");

        // Imprimir la lista original
        System.out.println("Original LinkedList: " + fruitsListaLigada);

        // Agregar un elemento en una posición específica
        fruitsListaLigada.add(2, "Pineapple"); // Agrega "Pineapple" en la posición 2
        System.out.println("After adding Pineapple: " + fruitsListaLigada);

        // Eliminar un elemento
        fruitsListaLigada.remove("Banana"); // Elimina "Banana"
        System.out.println("After removing Banana: " + fruitsListaLigada);

        // Acceder a un elemento por índice
        String firstFruit = fruitsListaLigada.get(0);
        System.out.println("First fruit: " + firstFruit); // Salida: Apple INTERNAL

        // Recorrer la LinkedList usando un bucle for-each
        System.out.println("Fruits in the list:");
        for (String fruit : fruitsListaLigada) {
            System.out.println(fruit);
        }

        // Verificar si la lista contiene un elemento
        boolean hasMango = fruitsListaLigada.contains("Mango");
        System.out.println("Contains Mango? " + hasMango); // Salida: true

        // Obtener el tamaño de la LinkedList
        int size = fruitsListaLigada.size();
        System.out.println("Size of the list: " + size); // Salida: 4

    }
}
