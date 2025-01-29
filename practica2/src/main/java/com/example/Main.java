package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

       String frase; 

       System.out.println("Escribe una frase");
       frase=sc.nextLine();
       System.out.println(frase);

       
   
       frase = frase.toUpperCase();
       System.out.println(frase);
       frase=frase.toLowerCase();
       System.out.println(frase);
       System.out.println(frase.length());
       System.out.println(frase.startsWith("a"));
       System.out.println(frase.replace("a","b"));
       
      // System.out.println(frase)
  

    }
}