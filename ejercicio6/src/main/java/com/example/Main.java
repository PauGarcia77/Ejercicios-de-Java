package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
System.out.println(
        "/**************************************/\n" + 
        "/* Nom: Pau Garcia Parets/\n" + 
        "/* DNI/NIE: 45371971D/ \n" + 
        "/* Data: 10/10/2024 /\n" +
        "/* Exercici: PROU2EX01/\n" + 
        "/**************************************/\r\n" + 
        "");

        Scanner sc=new Scanner(System.in);

int numero1=0;
int par=0;




        System.out.println("Introduce un numero positivo");
        numero1 = sc.nextInt();

        
            // introduzco un bucle  en el cual me inicia a partir del 1,el cual le pongo un if con una funcion de que cuando la i entre 2 sea mayor a 0 ese numero sera impar y luego un else para indicar que ese numero es par
        for(int i=1;i<=numero1;i++){
            if ((i%2)>0) {
            System.out.println(i+" El numero es impar");   
                    
            }
        
            else{
                System.out.println(i+" El numero es par");
                par++;
                
            }
           
            
        }
       
       
    }
}
