package com.example;

//Creo la clase hijo de eina
class serra extends eina {
 
    //hago el contructor con sus atributos con el super para llamarlos del padre
    public serra( double peso, String material) {
        super(peso,material);
    }
    //Usaremos el override para indicar que este metodo ya lo hemos creado en el padre con un sout que indique que esta cortndo con la sierra
    @Override
    public void utilitzar() {

        System.out.println("Tallant amb la serra.");
    }
    //Y lo mismo con el getnom, y hago que devuelva el nombre al padre para pasarlo al main luego
    @Override
    public String getnom(){
       return "Serra";
    }
}
    

