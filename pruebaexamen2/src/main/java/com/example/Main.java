package com.example;

import java.util.Random;

import javax.swing.text.TabSet;

public class Main {
    public static final int TAMANY_ZOOLOGIC = 3;

    public static void main(String[] args) {

        animal[] zoo = new animal[TAMANY_ZOOLOGIC];
        Random random = new Random();

        for (int i = 0; i < TAMANY_ZOOLOGIC; i++) {
            int tipoAnimal = random.nextInt(3);

            switch (tipoAnimal) {
                case 0:
                    zoo[i] = new gos("Gos " + (i + 1));
                    break;
                case 1:
                    zoo[i] = new aguila("Aguila " + (i + 1));
                    break;
                case 2:
                    zoo[i] = new peix("Peix " + (i + 1));
                    break;
            }
        }

        for (int i = 0; i < TAMANY_ZOOLOGIC; i++) {
            animal animal = zoo[i];
            animal.mostrarInformacio();
            animal.emetreSo();

            // Determinar la acción basada en el tipo de animal
            switch (animal.getTipus()) {
                case "Volador":
                    ((volador) animal).volar();
                    break;
                case "Aquatic":
                    ((aquatic) animal).nedar();
                    break;
                case "Terrestre":
                    ((terrestre) animal).caminar();
                    break;
            }
        }

    }
}