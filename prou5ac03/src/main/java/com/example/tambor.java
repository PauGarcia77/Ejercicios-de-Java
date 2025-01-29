package com.example;

public class tambor extends instrument implements Percussio  {

    public tambor(String nombre) {
        super(nombre, "Percussio");
    }

    @Override
    public void afinarTambor(){
        System.out.println(nombre+ " Afinant tambor");
    }
    @Override
    public void colpejarTambor(){
        System.out.println(nombre+" Colpejant tambor");
    }
    @Override
    public void interpretar(){
        System.out.println(nombre+" Interpretant tambor");
    }
}
