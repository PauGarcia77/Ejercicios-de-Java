package com.example;

public class guitarra extends instrument implements Cordes {

    public guitarra(String nombre) {
    super(nombre, "Corda");
    }
    @Override
    public void afinarCordes() {
        System.out.println(nombre+" Afinant cordes de la guitarra");
    }
    @Override
    public void tocarArpegis(){
        System.out.println(nombre+" Tocant arpegis");
    }
    @Override
    public void interpretar() {
        System.out.println(nombre+" Interpretant guitarra");
    }
}
