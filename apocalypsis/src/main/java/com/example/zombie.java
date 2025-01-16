package com.example;

/////Pau Garcia Parets/////
import java.util.Random;

public class zombie {
    // creo los atributos de la clase
    private int defensaZombie = 5;
    private int ataqueZombie = 5;
    private int vidaZombie = 20;
    private String nom = "";

    public zombie() {
        // creo el contructor
        this.defensaZombie = 5;
        this.ataqueZombie = 5;
        this.vidaZombie = 20;
        this.nom = "";
    }

    // Creo los métodos getters para acceder a los atributos de la clase.
    public int getataque() {
        return this.ataqueZombie;
    }

    public int getvida() {
        return this.vidaZombie;
    }

    public int getdefensa() {
        return this.defensaZombie;
    }

    public String getnom() {
        return this.nom;
    }

    // Hago los métodos setters para modificar los atributos de la clase.
    public void setataque(int ataqueZombie) {
        this.ataqueZombie = ataqueZombie;
    }

    public void setvida(int vidaZombie) {
        this.vidaZombie = vidaZombie;
    }

    public void setdefensa(int defensaZombie) {
        this.defensaZombie = defensaZombie;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    // Creo un metodo de ataque que genera un numero aleatorio entre el 0 y el
    // maximo del ataque del superviviente
    public int ataque() {
        Random aleatori = new Random();
        int numeroAleatori = aleatori.nextInt(ataqueZombie + 1);// Genera un número aleatorio.
        System.out.println("El ataque zombie de " + numeroAleatori);// Muestra el valor de la defensa generado
        return numeroAleatori;
    }

    // Creo un metodo de defensa que genera un numero aleatorio entre el 0 y el
    // maximo del ataque del superviviente
    public int defensa() {
        Random aleatori = new Random();
        int numeroAleatori = aleatori.nextInt(defensaZombie + 1);// Genera un número aleatorio.
        System.out.println("La defensa zombie es de " + numeroAleatori);// Muestra el valor de la defensa generado
        return numeroAleatori;
    }

    public void bajarVida(int ataque) {
        if (ataque >=0) {
            vidaZombie = vidaZombie - ataque;
        } else {
            
        }
    }
}
