package edu.itm.ejemplo.ejemploProgramacionFuncional;

import java.util.Arrays;
import java.util.List;

public class FunctionalListExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calcular la suma de los números pares
        int sumOfEvens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Sum of even numbers: " + sumOfEvens); // Salida: 30
    }
}
