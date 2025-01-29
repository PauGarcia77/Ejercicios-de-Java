package com.example;

public class animal {
    private double peso=10;
    private String color="";

    public animal(double nuevopeso, String nuevocolor){
        this.peso=nuevopeso;
        this.color=nuevocolor;
    }

    public void setpeso(double nuevopeso){
        this.peso=nuevopeso;
    }
    public void setcolor(String nuevocolor){
        this.color=nuevocolor;
    }
    public double getpeso(){
        return this.peso;
    }
    public void hazRuido(){
        System.out.println("muuuuh!!");
    }
    public String getcolor(){
        return this.color;
    }
}
