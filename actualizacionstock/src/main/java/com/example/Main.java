package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] productos = new String[25];
        double[] precios = new double[25];
        int[] stock = new int[25];
        int cantidad = 0;
        int buscar = 0;
        String busqueda = "";
        int posicion = 0;
        int contar = 0;

        System.out.println("Introduce cuantos productos quieres");
        cantidad = sc.nextInt();

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Ingrese el tipo de productos, el precio y el stock");
            productos[i] = sc.next();
            precios[i] = sc.nextDouble();
            stock[i] = sc.nextInt();
        }
        for (int i = 1; i <= cantidad; i++) {

            System.out.println("El producto introducido es " + productos[i]);
            System.out.println("El precio es " + precios[i]);
            System.out.println("El stock es de " + stock[i]);
        }

        System.out.println("Que producto desea buscar");
        busqueda = sc.next();

        for (int i = 1; i <= cantidad; i++) {
            contar = contar + 1;
            if (busqueda.equals(productos[i])) {
                posicion = contar;
            }

        }
        if (posicion > 0) {
            System.out.println("He encontrado el producto que buscas");
            System.out.println(productos[posicion] + " es el producto que buscas, hay " + stock[posicion]
                    + " de stock, y cuesta " + precios[posicion] + " euros");
        } else {
            System.out.println("No he encontrado el producto que deseas");
        }

    }
}