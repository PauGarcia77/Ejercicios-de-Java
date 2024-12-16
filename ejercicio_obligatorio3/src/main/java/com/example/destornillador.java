package com.example;

//Creo la otra clase del padre
class destornillador extends eina {

//Creo el contructor con los atributos del padre que llamamos con el super
    public destornillador( double peso, String material) {
        super(peso, material);
    }
    //Y lo mismo que en las otras dos , hacemos el override para indicarle que este metodo ya lo hemos creado en el padre
    @Override
    public void utilitzar() {

        System.out.println("Tornant cargols amb el destornillador.");
    }
    //Y lo mismo con el get nom le devolvemos el nombre al padre de la herramienta
    @Override
    public String getnom(){
        return "Destornillador";
    }
}
