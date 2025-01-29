package com.example;

import java.util.Scanner;


public class Main {

    public static int fecha=2024;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

int fechaintroducida;
int edad;
int respuesta=0;
        System.out.println("Cual es tu año de nacimiento");
       fechaintroducida= sc.nextInt();

       edad=fecha-fechaintroducida;

        if(edad >=18){
            System.out.println("Eres mayor de edad");
        }
        else if(fechaintroducida>fecha){
            System.out.println("Pon una fecha valida");
        }
        else  {
            System.out.println("Eres menor de edad");
        }
    }
}