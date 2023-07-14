/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainfigura;

/**
 *
 * @author albin
 */
public class Rectangulo implements Figura{

    private int Ancho;
    private int Largo;
    
    public Rectangulo(int ancho, int largo){
        this.Ancho = ancho;
        this.Largo = largo;
    }
    
    @Override
    public double calcularArea(){
        return Ancho*Largo;
    }
    @Override
    public double calcularPerimetro(){
        return (Ancho*2)+(Largo*2);
    }
}
