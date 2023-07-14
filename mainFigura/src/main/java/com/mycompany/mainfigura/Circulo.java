/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainfigura;

/**
 *
 * @author albin
 */
public class Circulo implements Figura{
    
    private int Radio;
    
    public Circulo(int radio){
        this.Radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(Radio, 2);
    }
    
    @Override
    public double calcularPerimetro(){
        return Math.PI*(Radio*2);
    }
}
