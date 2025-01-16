package com.example;

import java.util.Random;

//Creo la clase hijo de artefacte
public class armaAcer extends artefacte {
    public armaAcer() {
        // Llamo al constructor de la clase padre
        super(10, 0);
        // Genero un número aleatorio para el valor del aretefacto en el cual solo puede
        // ser entre 1 y 15
        Random numRandom = new Random();
        // Le asigno el valor al artefacto
        setValorArtefacte(1 + numRandom.nextInt(15));
    }

    // Creo el método aplicarEfecte que recibe un superviviente en el cual le
    // sumaremos el valor del artefacto al ataque del superviviente y luego si
    // encuentra ese artefacto mostrara un mensaje.
    @Override
    public void aplicarEfecte(supervivent supervivent) {
        int nouAtac = supervivent.getataque() + (int) getValorArtefacte();
        supervivent.setataque(nouAtac);
        System.out.println("Has trobat una arma d'acer! Bonus d'atac: " + (int) getValorArtefacte());
    }
}