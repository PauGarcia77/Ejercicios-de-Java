package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int vocales=0;
        int consonantes=0;
        String frase;
        int opcion=0;

        System.out.println("Introduce una frase");
        frase=sc.nextLine();

        
        
        System.out.println("Elige una opcion:\n" +
                        "1-Mostrar número de vocales\r\n" + //
                        "2-Mostrar número de consonantes\r\n" + //
                        "3-Convertir a mayúsculas\r\n" + //
                        "4-Convertir a minúsculas\r\n" + //
                        "5-Invertir la frase\r\n" + //
                        "6-Salir\r\n"  //
                        );

        switch (opcion) {

            case 1:
            
            System.out.println("En la frase hay un total de "+consonantes+" consonantes");
                break;
        
            default:
            System.out.println("Introduce una opcion correcta");
                break;
        }
        
        System.out.println("Hay "+vocales+" vocales");
    }
}