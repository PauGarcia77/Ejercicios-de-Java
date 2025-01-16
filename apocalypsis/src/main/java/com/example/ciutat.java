package com.example;

/////Pau Garcia Parets/////
public class ciutat {
    private String nombre = "";// Nombre de la ciudad
    private int tamany = 0; // Tamaño de la ciudad
    private zombie[] zombies = new zombie[0];// Array para almacenar zombies en la ciudad

    // Constructor de la clase
    public ciutat(String nombre, int tamany) {
        // creo los atributos de la clase
        this.nombre = nombre;// Asigna el nombre de la ciudad
        this.tamany = tamany;// Asigna el tamaño
        this.zombies = new zombie[tamany];// Crea un array de zombies con el tamaño especificado

        // Inicializa cada posición del array con un objeto `zombie`
        for (int i = 0; i < zombies.length; i++) {
            zombies[i] = new zombie();// Cada posición del array contiene un nuevo zombie
        }
    }

    // Método para obtener un zombie en una posición específica del array
    public zombie getposicionRuta(int posicioRuta) {
        // creo un if en el cual le indico que la condicion sea que posicionRuta si es
        // mayor o igual a 0 y posicionRuta menor a zombies que hay en el array,devuelve
        // el zombie en la posicion deseada.
        if (posicioRuta >= 0 && posicioRuta < zombies.length) {
            return zombies[posicioRuta]; // Devuelve el zombie en la posición solicitada
        } else {
            return null;// Si es else te dara `null` si la posición es inválida.
        }
    }

    public int getTamany() {
        return this.tamany;

    }
    public String getnombre() {
        return this.nombre;

    }
}
