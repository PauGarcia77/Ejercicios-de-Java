package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creo dos print para que el usuario introduzca el nombre del superviviente y de la ciudad
        System.out.print("Introduce el nombre del superviviente: ");
        String nombreSuperviviente = sc.nextLine();

        System.out.print("Introduce el nombre de la ciudad: ");
        String nombreCiudad = sc.nextLine();

        //Instancio un objeto de la clase superviviente y otro de la clase novaCiutat
        supervivent supervivente = new supervivent(nombreSuperviviente);
        novaCiutat ciudad = new novaCiutat(nombreCiudad, 100);

        System.out.println("\n----------------Comienza la aventura en " + nombreCiudad + "!--------------------");
        System.out.println("------------------------------------------------");
        //Empiezo ha hacer un bucle para recorrer la ciudad y los zombies
        for (int i = 0; i < ciudad.getTamany() && supervivente.getvida() > 0; i++) {
            zombie zombieActual = ciudad.getposicionRuta(i);
            
            // Comprobar si es un superZombie, con el instanceof para saber si es una instancia de superZombie
            if (zombieActual instanceof superZombie) {
                System.out.println("¡Has encontrado un SuperZombie " + (i + 1) + "!");
                System.out.println("Stats del SuperZombie - Vida: " + zombieActual.getvida() + 
                                 ", Ataque: " + zombieActual.getataque() + 
                                 ", Defensa: " + zombieActual.getdefensa());
            // Y si no es un zombie normal
            } else {
                System.out.println("¡Encuentro con zombie normal " + (i + 1) + "!");
                System.out.println("Stats del zombie - Vida: " + zombieActual.getvida() + 
                                 ", Ataque: " + zombieActual.getataque() + 
                                 ", Defensa: " + zombieActual.getdefensa());
            }
            
            // Creo el combate hasta que muera el zombie o el superviviente
            while (zombieActual.getvida() > 0 && supervivente.getvida() > 0) {
                // En el cual lucha primero el superviviente
                int dañoAlZombie = supervivente.ataque() - zombieActual.defensa();
                zombieActual.bajarVida(dañoAlZombie);
                System.out.println("Vida del zombie: " + zombieActual.getvida());

                // Si el zombie sigue vivo, contraataca contra el superviviente
                if (zombieActual.getvida() > 0) {
                    int dañoAlSuperviviente = zombieActual.ataque() - supervivente.defensa();
                    supervivente.bajarVida(dañoAlSuperviviente);
                    System.out.println("Vida del superviviente: " + supervivente.getvida());
                }
            }

            // Un if para cuando el zombie o el superzombie muere
            if (zombieActual.getvida() <= 0) {
                if (zombieActual instanceof superZombie) {
                    System.out.println("¡Has derrotado al SuperZombie " + (i + 1) + "!");
                } else {
                    System.out.println("¡Has derrotado al zombie " + (i + 1) + "!");
                }
                
                // Obtener y aplicar artefacto si existe
                artefacte artefactoActual = ciudad.getArtefacte(i);
                // Si el artefacto no es nulo, aplica el efecto al superviviente
                if (artefactoActual != null) {
                    // Muestro el mensaje de que se ha encontrado un artefacto
                    artefactoActual.aplicarEfecte(supervivente);
                    System.out.println("Stats actuales:");
                    System.out.println("Vida: " + supervivente.getvida());
                    System.out.println("Ataque: " + supervivente.getataque());
                    System.out.println("Defensa: " + supervivente.getdefensa());
                }
            }
            //Un if que muestra que el superviviente ha muerto cuando la vida es menor o igual a 0
            if (supervivente.getvida() <= 0) {
                System.out.println("\n¡" + supervivente.getnom() + " ha muerto en la ciudad!");
                System.out.println("Has perdido, llegaste hasta el zombie " + (i + 1));
            }

            System.out.println("------------------------------------------------");
        }
        //Y aqui mostrara el mensaje de que el superviviente ha sobrevivido
        if (supervivente.getvida() > 0) {
            System.out.println("\n¡Felicidades! " + supervivente.getnom() + 
                             " ha sobrevivido a la ciudad con " + 
                             supervivente.getvida() + " puntos de vida!");
        }
    }
}