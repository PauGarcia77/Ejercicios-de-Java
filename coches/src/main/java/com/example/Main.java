package com.example;

interface interficieConduir {
    void conduir();
    int obtenirVelocitatMaxima();
    
}
interface  habilitat {
    void albergarPersones(int nombre);
    int obtenirCapacitat();
    
}
abstract class vehicle {
    protected String nom;

    public vehicle(String nom) {
        this.nom = nom;
    }
    public void descriure() {
        System.out.println("Aquest vehicle es diu " + nom);
    }
}

class cotxe extends vehicle implements interficieConduir, habilitat {
    private int capacitat;

    public cotxe(String nom, int capacitat) {
        super(nom);
        this.capacitat = capacitat>=4  ? capacitat : 4;
    }

    @Override
    public void conduir() {
        System.out.println("Conduint el cotxe a una velocitat maxima de " + obtenirVelocitatMaxima() + " km/h");
    }

    @Override
    public int obtenirVelocitatMaxima() {
        return 200;
    }

    @Override
    public void albergarPersones(int nombre) {
        if (nombre<=capacitat) {
            System.out.println("El cotxe " + nom + " pot albergar " + nombre + " persones");   
        }else{
            System.out.println("El cotxe no pot albergar  mes de "+ capacitat+"persones" );
        }
    }

    @Override
    public int obtenirCapacitat() {
        return capacitat;
    }

    
}

class moto extends vehicle implements interficieConduir{

    private int capacitat;

    public moto(String nom,int capacitat) {
        super(nom);
        this.capacitat = capacitat>=2 ? capacitat : 2;
    }

    @Override
    public void conduir() {
        System.out.println("Conduint la moto ");
    }

    @Override
    public int obtenirVelocitatMaxima() {
        return 300;
    }
    

    
}


public class Main {
    public static void main(String[] args) {

        cotxe aCotxe = new cotxe("Cotxe1", 6);
        aCotxe.descriure();
        aCotxe.albergarPersones(6);
        aCotxe.conduir();

        moto aMoto = new moto("Moto1", 3);
        aMoto.descriure();
        aMoto.conduir();

    }
}