package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
      /**************************************/
      /* Nom: Pau Garcia Parets				*/
      /* DNI/NIE: 45371971D			*/
      /* Data: 14/10/2024				*/
      /* Exercici:PROU2EX02				*/
      /**************************************/

        Scanner sc=new Scanner(System.in);
        //Declaro las variables que voy a utilizar
        int respuesta=0;
        int numero1=0;
        int numero2=0;
        int opcion=0;
        int veces=5;
        boolean numcero1=true;
        boolean numcero2=false;  

        //Creo un bucle en el cual empieza en el 0 y repite el proceso 5 veces ya que declaro la variable "veces"=5
        for(int i=0;i<=veces;i++){
            //Le pido al usuario que eliga la opcion que desea
            System.out.println("Eligue alguna opcion: \n 1.Sumar\n 2.Restar\n 3.Multiplicar\n 4.Dividir\n 5.Salir\n" );
            opcion= sc.nextInt();
            //creo un switch con las 5 opciones que quiero
            switch (opcion) {
                case 1:
                    //le digo al usuario que ha elegido dicha ocpcion, le pido los dos numeros al usuario, luego realiza la operacion y sale el resultado
                    System.out.println("Has elegido la opcion de sumar, introduce dos numeros");
                    numero1=sc.nextInt();
                    numero2=sc.nextInt();
                    respuesta=numero1+numero2;
                    System.out.println("El total de la suma es " +respuesta);
                    break;

                case 2:
                //le digo al usuario que ha elegido dicha ocpcion, le pido los dos numeros al usuario, luego realiza la operacion y sale el resultado
                     System.out.println("Has elegido restar, introduce dos numeros");
                     numero1=sc.nextInt();
                     numero2=sc.nextInt();
                     respuesta=numero1-numero2;
                     System.out.println("El total de la resta es " +respuesta);
                     break;

                case 3:
                //le digo al usuario que ha elegido dicha ocpcion, le pido los dos numeros al usuario, luego realiza la operacion y sale el resultado
                     System.out.println("Has elegido Multiplicar, introduce dos numeros");
                     numero1=sc.nextInt();
                     numero2=sc.nextInt();
                     respuesta=numero1*numero2;
                     System.out.println("El total de la multiplicacion es " +respuesta);
                     break;

                case 4:
                    //aqui elige dividir, 
                    System.out.println("Has elegido divir, introduce dos numeros");
                    numcero1=true;
                    numero1=0;
                    numero2=0;
                    //creo un while en el cual numcero1 es true para que entre en el bucle
                    while (numcero1) {
                        //en el if pongo que si el numero1 o numero2 es igual a 0, imprima que vaya cuidado con el 0, y el usuario introduce los dos digitos. 
                        //Y cuando el usuario ponga 2 numeros cualquieras saldra del bucle indicando que nuymcero1 es falso, y realizara la operacion imprimiendola.
                        // Si el usuario deseara otra vez dividir, pongo las dos variables a 0 otra vez para que si pone un 0 vuelva a entrar al bucle 
                        if (numcero1 && numero1==0 || numero2 ==0 ) {
                            System.out.println("ten cuidado no utilizes el 0");
                            numero1=sc.nextInt();
                            numero2=sc.nextInt();
                            
                            
                        }
                        else{
                            numcero1=false;
                            
                        }
                        
                        
                    }
                    respuesta= numero1/numero2;
                    System.out.println("El resultado de dividir es " +respuesta);   

            
                    break;
                    //por ultimo esta la opcion de salir en el cual si seleccionas el 5 acabara el programa 
                case 5:
                     System.out.println("Has elegido salir");
                     i=veces;
                     break;
                    //si el usuario introduce un numero fura del intervalo entre 1 y 5 saldra ese mensaje 
                default:
                  System.out.println("Escribe un numero correcto de las opciones");
                
                       
            }
        }
    }
}