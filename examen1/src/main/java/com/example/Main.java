package com.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] niños = new int[8];// creo un array llamada niños en el cual le digo que sea de 8 espacios porque
                                 // el for lo empiezo desde el 1
        int caramelos = 0;
        int valorMax = 0;// creo la variable valormax para poder saber cual de los niños tiene mas
                         // caramelos
        

        // creo un bucle for en el cual me inicie a partir del uno, donde le pregunto a
        // x niño que introduzca cuantos caramelos tiene y lo guarda
        for (int i = 1; i < niños.length; i++) {
            System.out.println("Niño " + i + " cuantos caramelos tienes");
            niños[i] = sc.nextInt();
            caramelos = niños[i];
        }
        // creo otro bucle for para poder identificar cual de todos los niños tiene mas
        // caramelos, en el cual le pongo un if que si el array de niños es mayor del
        // valorMax, lo imprimira luego del for
        for (int i = 1; i < niños.length; i++) {
           
            if (niños[i] > valorMax) {
                valorMax = niños[i];
    
            }
            //le imprimo al usuario cada niño cuantos caramelos tiene
            System.out.println(" El niño " + i + " tendra " + niños[i] + " caramelos");

        }
        // imprimo el usuario que mas caramelos tiene
        System.out.println("El que mas caramelos tiene son " + valorMax + " caramelos");
        // creo un if para saber que si el niño 1 es el que mas caramelos tiene siga
        // vivo
        if (niños[1] > caramelos) {
            System.out.println("El primer niño sigue vivo porque ha recogido " + niños[1] + " caramelos");

        }
        // creo un if para saber que si el niño 1 es el que mas caramelos tiene siga
        // vivo
        else if (niños[2] > caramelos) {
            System.out.println("El segundo niño sigue vivo porque ha recogido " + niños[2] + " caramelos");

        }
        // creo un if para saber que si el niño 1 es el que mas caramelos tiene siga
        // vivo
        else if (niños[3] > caramelos) {
            System.out.println("El tercer niño sigue vivo porque ha recogido " + niños[3] + " caramelos");

        }
        // creo un if para saber que si el niño 1 es el que mas caramelos tiene siga
        // vivo
        else if (niños[4] > caramelos) {
            System.out.println("El cuarto niño sigue vivo porque ha recogido " + niños[4] + " caramelos");

        } // creo un if para saber que si el niño 1 es el que mas caramelos tiene siga
          // vivo
        else if (niños[5] > caramelos) {
            System.out.println("El quinto niño sigue vivo porque ha recogido " + niños[5] + " caramelos");

        } // creo un if para saber que si el niño 1 es el que mas caramelos tiene siga
          // vivo
        else if (niños[6] > caramelos) {
            System.out.println("El sexto niño sigue vivo porque ha recogido " + niños[6] + " caramelos");

        } // creo un if para saber que si el niño 1 es el que mas caramelos tiene siga
          // vivo
        else if (niños[7] > caramelos) {
            System.out.println("El septimo niño sigue vivo porque ha recogido " + niños[7] + " caramelos");

        }
    }
}