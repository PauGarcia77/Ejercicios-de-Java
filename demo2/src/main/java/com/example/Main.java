package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Random random = new Random();
    int numerorandom= random.nextInt(100) + 1;

    int conteo=0;
    int intentos=0;
    int cercania=0;
    int jugar=0;

    System.out.println(numerorandom);
    System.out.println("Intenta adivinar el numero random");
    intentos= sc.nextInt();
    conteo=conteo+1;
    System.out.println("Llevas "+conteo+" intentos");
    
    if(intentos<1 || intentos>100){
        System.out.println("Debes escribir un numero entre 1 y 100");
    }
    else{

        

    while ( numerorandom != intentos) {
        cercania = Math.abs(numerorandom - intentos);

       
        if(cercania<=10){
            System.out.println("Estas casi cerca");
        }
        else if(cercania<=20){
            System.out.println("Estas algo alejado");
        }
        else if(cercania<=35){
            System.out.println("Estas muy alejado");
        }

        if(intentos > numerorandom){
            System.out.println("Numero mas pequeño");
        }
         else if(intentos < numerorandom) {
            System.out.println("Numero mas grande");
        }
        System.out.println("Intenta adivinar de nuevo el numero");
        intentos= sc.nextInt();
        conteo++;
        System.out.println("Llevas "+conteo+" intentos");
       

    }
    
        System.out.println("Felicidades lo has adivinado");
        System.out.println("Has necesitado "+conteo+" intentos");
    }   
    }
}