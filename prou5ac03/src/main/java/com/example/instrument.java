package com.example;

abstract class instrument {
    protected String nombre;
    protected String tipo;

    public instrument(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void mostrarinformacio(){
        System.out.println("Instrument "+nombre + " Tipus: " + tipo);
    
    } 
    public abstract void interpretar();
}
