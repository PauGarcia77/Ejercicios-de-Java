package com.example;

import java.util.Random;

//Otra clase hija de artefacte
public class escud extends artefacte {
    public escud() {
        super(15, 0); // pes más pesado para escudo
        Random numRandom = new Random();
        // Genero un número aleatorio para el valor del aretefacto en el cual solo puede
        // ser entre 0.9 y 1.5 y luego se lo aplico al valor del artefacto
        setValorArtefacte(0.9 + (1.5 - 0.9) * numRandom.nextDouble());
    }

    // Sobreescribo el método aplicarEfecte que recibe un superviviente en el cual
    // le multiplicaremos el valor del artefacto a la defensa del superviviente y
    // luego si encuentra ese artefacto mostrara un mensaje.
    @Override
    public void aplicarEfecte(supervivent supervivent) {
        int novaDefensa = (int) (supervivent.getdefensa() * getValorArtefacte());
        supervivent.setdefensa(novaDefensa);
        System.out.println("Has encontrado un escudo. Multiplicador de defensa: " + getValorArtefacte());
    }
}