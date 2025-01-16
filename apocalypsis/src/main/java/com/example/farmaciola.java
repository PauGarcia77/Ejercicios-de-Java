package com.example;

import java.util.Random;

public class farmaciola extends artefacte {
    public farmaciola() {
        super(5, 0); // pes más ligero para botiquín
        Random numRandom = new Random();
        setValorArtefacte(1 + numRandom.nextInt(15));
    }
    
    @Override
    public void aplicarEfecte(supervivent supervivent) {
        int curacio = (int)getValorArtefacte();
        int novaVida = supervivent.getvida() + curacio;
        supervivent.setvida(novaVida);
        System.out.println("Has encontrado un botiquin. Curació: " + curacio);
    }
}