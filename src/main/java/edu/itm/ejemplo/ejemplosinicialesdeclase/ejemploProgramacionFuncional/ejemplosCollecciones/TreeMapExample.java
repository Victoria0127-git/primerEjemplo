package edu.itm.ejemplo.ejemplosinicialesdeclase.ejemploProgramacionFuncional.ejemplosCollecciones;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TreeMapExample {

    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new TreeMap<>();
        fruitPrices.put("Banana", 25);
        fruitPrices.put("Apple", 3);
        fruitPrices.put("Orange", 45);

        // Usar Streams para obtener el precio más bajo
        fruitPrices.entrySet().stream()
                .min(Map.Entry.comparingByValue())
                .ifPresent(entry -> System.out.println("Cheapest fruit: " + entry.getKey() + " at " + entry.getValue()));

        Stream<Map.Entry<String,Integer>> eo =  fruitPrices.entrySet().stream();

    }
}
