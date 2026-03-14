package edu.itm.ejemplo.ejemplosCollecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // Duplicado no permitido

        System.out.println(fruits); // Salida: [Apple, Banana] (el orden puede variar)
        boolean exists = fruits.contains("Apple"); // Acceso rápido para verificar existencia

        LinkedHashSet<String> fruitsLinkedList = new LinkedHashSet<>();

        // Agregar elementos al LinkedHashSet
        fruitsLinkedList.add("Apple");
        fruitsLinkedList.add("Banana");
        fruitsLinkedList.add("Orange");
        fruitsLinkedList.add("Mango");
        fruitsLinkedList.add("Banana"); // Duplicado no permitido

        // Imprimir el LinkedHashSet
        System.out.println("Fruits in LinkedHashSet: " + fruitsLinkedList); // Salida: [Apple, Banana, Orange, Mango]

        // Verificar si un elemento existe
        boolean hasApple = fruitsLinkedList.contains("Apple");
        System.out.println("Contains Apple? " + hasApple); // Salida: true

        // Eliminar un elemento
        fruitsLinkedList.remove("Orange");
        System.out.println("After removing Orange: " + fruitsLinkedList); // Salida: [Apple, Banana, Mango]

        // Iterar sobre el LinkedHashSet
        System.out.println("Fruits in insertion order:");
        for (String fruit : fruitsLinkedList) {
            System.out.println(fruit);
        }


    }

}
