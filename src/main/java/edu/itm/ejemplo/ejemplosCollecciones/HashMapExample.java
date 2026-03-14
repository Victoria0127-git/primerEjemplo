package edu.itm.ejemplo.ejemplosCollecciones;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        // Crear un HashMap
        Map<String, Integer> fruitPrices = new HashMap<>();

        // Agregar elementos al HashMap
        fruitPrices.put("Apple", 3);
        fruitPrices.put("Banana", 2);
        fruitPrices.put("Orange", 4);


        // Acceso por clave
        System.out.println("Price of Apple: " + fruitPrices.get("Apple")); // Salida: 3

        // Verificar si una clave existe
        if (fruitPrices.containsKey("Banana")) {
            System.out.println("Price of Banana: " + fruitPrices.get("Banana")); // Salida: 2
        }

        // Eliminar un elemento
        fruitPrices.remove("Orange");

        // Iterar sobre el HashMap
        System.out.println("Fruit Prices:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        System.out.println("ingreso nuevas frutas ");

        fruitPrices.put("liche", 50);
        fruitPrices.put("Banana", 34);

        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
