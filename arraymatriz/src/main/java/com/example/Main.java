package com.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matriz = {
                { 4, 2 },
                { 4, 5 },
                { 7, 8 }
        };
        int suma = 0;
        int posicionmax = matriz[0][0];
        int posicionmin = matriz[0][0];
        int media = 0;
        int contar = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma = matriz[i][j] + suma;
                contar++;
                media = suma / contar;
                System.out.println("La fila " + i + " columna " + j + " es " + matriz[i][j]);
                if (matriz[i][j] > posicionmax) {
                    posicionmax = matriz[i][j];
                } else if (matriz[i][j] < posicionmin) {
                    posicionmin = matriz[i][j];
                }
            }
        }

        System.out.println("La media es " + media);
        System.out.println("La suma de la matriz es " + suma);
        System.out.println("El numero maximo es " + posicionmax);
        System.out.println("El numero minimo es " + posicionmin);
    }
}  