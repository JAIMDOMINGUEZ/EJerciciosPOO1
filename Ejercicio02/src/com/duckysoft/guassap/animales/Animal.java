package com.duckysoft.guassap.animales;
public class Animal{
    private String nombre;
    private int raza;
    private float precio;
    public Animal(String nombre,int raza, float precio){
        this.nombre = nombre;
        this.raza = raza;
        this.precio = precio;
    }
    public float getPrecio(){
        boolean inbox = true;
        if(inbox){
            return precio;
        } 
        return 0.0f;
    }
    public void setPrecio(float precio){
        boolean duenio = true;
        if(duenio){
            this.precio = precio;
        }
        
    }

}