package com.example;

class aguila extends animal implements volador {

    public aguila(String nom){
        super(nom,"Volador");
    }
    @Override
    public void volar(){
        System.out.println(nom+"Estic volant");
    }
    @Override
    public void emetreSo(){
        System.out.println("Screech");
    }

    
}
