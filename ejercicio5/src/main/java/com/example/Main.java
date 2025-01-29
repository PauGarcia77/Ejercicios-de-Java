package com.example;

 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

int numero1=0;
int par=0;
int suma=0;
String seguir="";
int continuar=0;
boolean numeroinvalido=true;
        
      try{
          while ( numeroinvalido && continuar==0) {

                System.out.println("Introduce un numero positivo");
                numero1 = sc.nextInt();

                if (numero1<1) {
                    System.out.println("Ingresa un numero valido");
                }
                else{
                    numeroinvalido=false;
                }
            

                for(int i=1;i<numero1;i++){
                    if ((i%2)>0) {
                    System.out.println(i+" El numero es impar");   
                            
                    }
                
                    else{
                        System.out.println(i+" el numero es par");
                        par++;
                        suma++;
                    }
                   
                    
                }
                
            
            if(numeroinvalido == false){

                System.out.println("En total hay " + par + " numeros pares");
                System.out.println("La suma total de numeros pares es "+suma);
                System.out.println("Quieres seguir jugando s/n");
                seguir =sc.next();

                if(seguir.equals("s")){
                continuar=0;
                numeroinvalido=true;
                }
                else{
                continuar=1;
                }
            }
    }

}
    catch(Exception e){

    System.out.println("es erroneo "+e.getMessage());

    }

    
    
}
}