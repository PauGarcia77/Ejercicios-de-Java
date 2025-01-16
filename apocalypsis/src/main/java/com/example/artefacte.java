package com.example;
//Creo la clase padre de las armas
public class artefacte {
    private int pes;
    private double valorArtefacte;
    // Constructor de la clase artefacte con los parametros pes y valorArtefacte
    public artefacte(int pes, double valorArtefacte) {
        this.pes = pes;
        this.valorArtefacte = valorArtefacte;
    }
    // Creo los métodos getters y setters para acceder a los atributos de la clase.
    public void setPes(int pes) {
        this.pes = pes;
    }
    
    public int getPes() {
        return this.pes;
    }
    
    public void setValorArtefacte(double valorArtefacte) {
        this.valorArtefacte = valorArtefacte;
    }
    
    public double getValorArtefacte() {
        return this.valorArtefacte;
    }
    //Este es el metodo que se sobreescribira en las clases hijas con el override
    public void aplicarEfecte(supervivent supervivent) {
        // Método base que será sobreescrito por las clases hijas
    }
}