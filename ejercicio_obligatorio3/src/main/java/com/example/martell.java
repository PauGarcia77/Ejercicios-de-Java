package com.example;
//Creo la otra clase del padre
class martell extends eina {
    public martell( double peso, String material) {
        super( peso, material);
    }
//Y lo mismo que en las otras dos , hacemos el override para indicarle que este metodo ya lo hemos creado en el padre
    @Override
    public void utilitzar() {
        System.out.println("Colpejant amb el martell.");
    }
      //Y lo mismo con el get nom le devolvemos el nombre al padre de la herramienta
    @Override
    public String getnom(){
        return "Martell";
    }
}
    

