package com.example;

interface Cordes {
    void afinarCordes();
    void tocarArpegis();
}
interface Percussio{
    void afinarTambor();
    void colpejarTambor();
}
interface Vent{
    void afinarVent();
    void ferSonar();
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        guitarra guitarra = new guitarra("Guitarra");
        tambor tambor = new tambor("Tambor");
        flauta flauta = new flauta("Flauta");

        guitarra.mostrarinformacio();
        guitarra.afinarCordes();
        guitarra.tocarArpegis();
        guitarra.interpretar();
        System.out.println("--------------------");
        tambor.mostrarinformacio();
        tambor.afinarTambor();
        tambor.colpejarTambor();
        tambor.interpretar();
        System.out.println("--------------------");
        flauta.mostrarinformacio();
        flauta.afinarVent();
        flauta.ferSonar();
        flauta.interpretar();
    }
}