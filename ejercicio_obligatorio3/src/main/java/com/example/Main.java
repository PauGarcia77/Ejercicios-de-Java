package com.example; 

public class Main {
    public static void main(String[] args) {
        //Pau Garcia P arets

        // Creo la instancias de cada clase con un peso de "x" kg y material "x".
        martell martell = new martell(1.5, "Metall");
        destornillador destornillador = new destornillador(0.7, "Acer");
        serra serra = new serra(2.3, "Madera");
        

        // Llamo al método `mostrarEina` pasando la instancia de cada uno correspondiente.
        mostrarEina(martell);
        mostrarEina(destornillador);
        mostrarEina(serra);
        
    }

    public static void mostrarEina(eina eina) {
        // Defino este método que sirve para mostrar información y utilizar la herramienta.
        eina.utilitzar();
        // Llama al método `utilitzar` de la instancia `eina`.
        System.out.println(
            "Eina: " + eina.getnom() + ", Pes: " + eina.getpeso() + " kg, Material: " + eina.getmaterial());
        // Imprime por la consola el nombre, peso y material de la herramienta utilizando los métodos `getnom`, `getpeso` y `getmaterial`.
        System.out.println("----------------------------------------------------");
    }
}
