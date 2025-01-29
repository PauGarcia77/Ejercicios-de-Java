package com.example;

public class gato extends animal{
    public gato(double peso, String color) {
        super(peso);
        super(color);
    }

    @Override
    public void hazRuido() {
        System.out.println("El gato maulla");
    }
}
