package com.example;

public class Main {
    public static void main(String[] args) {

        animal miAnimal= new animal(23, null);
        animal scooby= new perro(23);
        animal pepe= new gato(45);
    

        miAnimal.getcolor();
        scooby.hazRuido();

        double unpeso= scooby.getpeso();
        System.out.println(unpeso);

        double otropeso= pepe.getpeso();
        System.out.println(otropeso);
        
        String colorgato= pepe.getcolor();
        System.out.println(colorgato);
    }
}