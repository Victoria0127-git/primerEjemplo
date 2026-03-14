package edu.itm.ejemplo.ejemploProgramacionFuncional;

import java.util.HashMap;
import java.util.Map;

public class FunctionalExample {
    public static void main(String[] args) {
        Map<String, Double> studentGrades = new HashMap<>();
        studentGrades.put("Alice", 65.0);
        studentGrades.put("Bob", 99.0);
        studentGrades.put("Charlie", 48.0);

        // Calcular la media de las calificaciones
        double average = studentGrades.values().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average grade: " + average);
    }
}
