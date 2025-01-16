package com.example;
import java.util.Random;
 /////Pau Garcia Parets/////

public class supervivent {
    private int ataqueSupervivent=10;//Ataque del superviviente
    private int vidaSupervivent=100;//Vida del superviviente
    private int defensaSupervivent=10;//Defensa del superviviente
    private String nom="";//Nombre del superviviente


    public supervivent(String nom) {
        // creo el constructor con cada atributo
        this.ataqueSupervivent=10;
        this.vidaSupervivent=100;
        this.defensaSupervivent=10;
        this.nom=nom;
    }
    // Creo los métodos getters para acceder a los atributos de la clase.
    public int getataque(){
        return this.ataqueSupervivent;
    }
    public int getvida(){
        return this.vidaSupervivent;
    }
    public int getdefensa(){
        return this.defensaSupervivent;
    }
    public String getnom(){
        return this.nom;
    }
    //  Hago los métodos setters para modificar los atributos de la clase.
    public void setataque(int ataqueSupervivent){
        this.ataqueSupervivent=ataqueSupervivent;
    }
    public void setvida(int vidaSupervivent){
        this.vidaSupervivent=vidaSupervivent;
    }
    public void setdefensa(int defensaSupervivent){
        this.defensaSupervivent=defensaSupervivent;
    }
    //Creo un metodo de ataque que genera un numero aleatorio entre el 0 y el maximo del ataque del superviviente
    public int ataque() {
        Random aleatori=new Random();
        int numeroAleatori= aleatori.nextInt(ataqueSupervivent+1); // Genera un número aleatorio.
        System.out.println("El ataque superviviente es de " +numeroAleatori); // Muestra el valor del ataque generado
        return numeroAleatori;
    }
     //Creo un metodo de defensa que genera un numero aleatorio entre el 0 y el maximo del ataque del superviviente
    public int defensa() {
        Random aleatori=new Random();
        int numeroAleatori= aleatori.nextInt(defensaSupervivent+1);  // Genera un número aleatorio.
        System.out.println("La defensa superviviente es de " +numeroAleatori);  // Muestra el valor de la defensa generado
        return numeroAleatori;
    }
    public void bajarVida(int ataque){
        if (ataque >=0) {
            vidaSupervivent = vidaSupervivent - ataque;
        } else {

        }
    }
    




}

