package com.example;

class peix extends animal implements aquatic {
    
    public peix(String nom){
        super(nom, "Aquatic");

    }
    @Override
    public void nedar(){
        System.out.println("Estic nedant");
    }
    @Override
    public void emetreSo(){
        System.out.println("Blup Blup");
    }
    
}
