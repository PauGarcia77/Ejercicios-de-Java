package com.example;

import java.util.Random;

public class novaCiutat extends ciutat {
    //Creo los dos arrays de artefactos y zombies
    private artefacte[] artefactes;
    private boolean armaFocTrobada;
    private zombie[] zombies;
    //Creo el constructor de la clase novaCiutat
    public novaCiutat(String nombre, int tamany) {
        //Llamo al constructor de la clase padre
        super(nombre, tamany);
        //Inicializo los arrays de artefactos y zombies
        this.artefactes = new artefacte[tamany];
        this.zombies = new zombie[tamany];
        this.armaFocTrobada = false;
        //Llamo a los metodos de generar artefactos y zombies
        generarArtefactes();
        generarZombies();
    }
    //Creo el metodo de generar artefactos
    private void generarArtefactes() {
        Random random = new Random();
        //Creo los randoms para las probabilidades de los artefactos
        for (int i = 0; i < artefactes.length; i++) {
            int probabilitat = random.nextInt(100);
            //Creo un if en el que si la probabilidad es menor que 1 y no se ha encontrado un arma de fuego se creara un arma de fuego y luego lo inicializare y pasara a true
            if (probabilitat < 1 && !armaFocTrobada) { // 1% arma de foc (solo una)
                artefactes[i] = new armaFoc();
                armaFocTrobada = true;
            }
            //Creo un if en el que si la probabilidad es menor que 4 se creara un arma de acero
            else if (probabilitat < 4) { // 3% arma d'acer
                artefactes[i] = new armaAcer();
            }
            //Creo un if en el que si la probabilidad es menor que 9 se creara una farmaciola
            else if (probabilitat < 9) { // 5% farmaciola
                artefactes[i] = new farmaciola();
            }
            //Creo un if en el que si la probabilidad es menor que 19 se creara un escudo
            else if (probabilitat < 19) { // 10% escud
                artefactes[i] = new escud();
            }
            //Creo un else en el que si no se cumple ninguna de las anteriores se creara un artefacto nulo
            else {
                artefactes[i] = null;
            }
        }
    }
    //Creo el metodo de generar zombies
    private void generarZombies() {
        Random random = new Random();
        //Creo un bucle para recorrer el array de zombies
        for (int i = 0; i < zombies.length; i++) {
            //Creo el random para la probabilidad de que sea un superZombie
            int probabilitat = random.nextInt(10); // Número del 0 al 9
            //Creo un if en el que si la probabilidad es 0 se creara un superZombie
            if (probabilitat == 0) { // 1 de cada 10 (10%) será superZombie
                zombies[i] = new superZombie();
            }
            //y sino se creara un zombie normal
            else {
                zombies[i] = new zombie();
            }
        }
    }
    //Sobreescribo el método de la clase padre para usar nuestro array de artefactos
    public artefacte getArtefacte(int posicio) {
        //Creo un if en el que si la posicion es mayor o igual a 0 y menor que la longitud del array de artefactos devolvera el artefacto
        if (posicio >= 0 && posicio < artefactes.length) {
            return artefactes[posicio];
        }
        return null;
    }

    // Sobreescribimos el método de la clase padre para usar nuestro array de zombies
    @Override
    public zombie getposicionRuta(int posicio) {
        //Aqui lo mismo que en el metodo anterior pero con el array de zombies
        if (posicio >= 0 && posicio < zombies.length) {
            return zombies[posicio];
        }
        return null;
    }
}