package com.example;

public class superZombie extends zombie {
    
    public superZombie() {
        // Llamamos al constructor de zombie
        super();
        // Triple de salud
        this.setvida(this.getvida() * 3);
        // Doble de ataque
        this.setataque(this.getataque() * 2);
        // La defensa se mantiene igual
    }
    @Override
    public String toString() {
        return "SuperZombie [vida=" + this.getvida() + 
               ", ataque=" + this.getataque() + 
               ", defensa=" + this.getdefensa() + "]";
    }
}