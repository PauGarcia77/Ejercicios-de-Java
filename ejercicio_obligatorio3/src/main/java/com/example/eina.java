package com.example;

//Creo la clase abstracta la cual sera el padre con dos atribuos
public abstract class eina {
    private double peso;
    private String material;

    // Hago el contructor en el cual cuando creemos en el main la instanciacion de
    // cada objeto nos pida por parametros el peso y material
    public eina(double peso, String material) {
        this.peso = peso;
        this.material = material;

    }

    // Creo el set del peso por si luego quiero cambiar el valor en el main
    public void setpeso(double peso_eina) {
        peso_eina = this.peso;
    }

    // Creo un get del peso para que me devuelva el peso
    public double getpeso() {
        return this.peso;
    }

    // Lo mismo que el otro set que al final no lo utilizo
    public void setmaterial(double material_eina) {
        material_eina = this.peso;
    }

    // Y aqui mas de lo mismo para que me devuelva el material
    public String getmaterial() {
        return this.material;
    }

    // creo el correspondiente metodo de utilitzar para luego desde cada hijo lo
    // pueda llamar
    public abstract void utilitzar();

    // Aqui un getnom para que me de el nombre de cada hijo, que luego en cada hijo
    // hare el override con un get nombre para que me devuelva el nombre de esa
    // herramienta sin tener que pasarle el nombre al padre y luego llamarlo del
    // main.
    public abstract String getnom();
}
