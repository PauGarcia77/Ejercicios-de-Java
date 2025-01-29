package com.example;

interface terrestre{
    void caminar();
}
interface volador {
    void volar();
}
interface aquatic{
    void nedar();
}
abstract class animal {
    protected String nom;
    protected String tipus;

    public animal(String nom,String tipus){
        this.nom= nom;
        this.tipus=tipus;
       
    }
    public void mostrarInformacio(){
        System.out.println( "Animal "+nom+ " ,tipus "+tipus);
    }
    public String getTipus() {
        return tipus;
    }
    public abstract void emetreSo();

}
