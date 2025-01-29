package com.example;

class gos extends animal implements terrestre {
    public gos(String nom){
        super(nom, "Terrestre");
       
    }
    @Override
    public void caminar(){
        System.out.println("Estic caminant");
    }
    @Override
    public void emetreSo(){
        System.out.println("Bup bup");
    }

    
}
