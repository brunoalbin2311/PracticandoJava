/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.circulo;

/**
 *
 * @author albin
 */
public class Circulo {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5);
        System.out.println("Radio: "+circulo1.getRadio());
        System.out.println("Area: "+circulo1.calcularArea());
        System.out.println("Perímetro: "+circulo1.calcularPerimetro());
    }
    
    private int Radio;
    
    public Circulo(int radio){
        this.Radio = radio;
    }
    
    public int getRadio(){
        return Radio;
    }
    
    public double calcularArea(){
        return Math.PI*Math.pow(Radio, 2);
    }
    
    public double calcularPerimetro(){
        return Math.PI*(Radio*2);
    }
}
