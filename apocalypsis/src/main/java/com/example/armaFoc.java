package com.example;

import java.util.Random;

//Creo la clase arma Foc hijo de artefacte
public class armaFoc extends artefacte {
    public armaFoc() {
        // Llamo al constructor de la clase padre
        super(10, 0); // pes por defecto 10
        // Genero un número aleatorio para el valor del artefacto en el cual solo puede
        // ser un número entre 0.9 y 1.5
        Random numRandom = new Random();
        // Le asigno el valor al artefacto
        setValorArtefacte(0.9 + (1.5 - 0.9) * numRandom.nextDouble());
    }

    // Creo el método aplicarEfecte que recibe un superviviente en el cual le
    // multiplicaremos el valor del artefacto al ataque del superviviente y luego si
    // aparece ese artefacto mostrara un mensaje.
    @Override
    public void aplicarEfecte(supervivent supervivent) {
        int nouAtac = (int) (supervivent.getataque() * getValorArtefacte());
        supervivent.setataque(nouAtac);
        System.out.println("Has trobat una arma de foc! Multiplicador d'atac: " + getValorArtefacte());
    }
}