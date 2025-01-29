package com.example;

import java.util.Scanner;

public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        int vocales = 0;
        int consonantes = 0;
        
        // Contamos vocales y consonantes
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c >= 'a' && c <= 'z') { // Comprobamos que es una letra
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        int opcion;
        do {
            // Menú de opciones
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Mostrar número de vocales");
            System.out.println("2. Mostrar número de consonantes");
            System.out.println("3. Convertir a mayúsculas");
            System.out.println("4. Convertir a minúsculas");
            System.out.println("5. Invertir la frase");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    System.out.println("Número de vocales: " + vocales);
                    break;
                case 2:
                    System.out.println("Número de consonantes: " + consonantes);
                    break;
                case 3:
                    System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
                    break;
                case 4:
                    System.out.println("Frase en minúsculas: " + frase.toLowerCase());
                    break;
                case 5:
                    String fraseInvertida = new StringBuilder(frase).reverse().toString();
                    System.out.println("Frase invertida: " + fraseInvertida);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 6);
        
        scanner.close();
    }
}
