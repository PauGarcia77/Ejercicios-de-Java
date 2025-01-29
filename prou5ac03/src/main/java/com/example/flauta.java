package com.example;

public class flauta extends instrument implements Vent{

    public flauta(String nombre) {
    super(nombre, "Vent");
    }

    @Override
    public void afinarVent() {
        System.out.println(nombre+" Afinant vent de la flauta");
    }
    @Override
    public void ferSonar(){
        System.out.println(nombre+" Fent sonar la flauta");
    }
    @Override
    public void interpretar(){
        System.out.println(nombre+" Interpretant flauta");
    }

}
