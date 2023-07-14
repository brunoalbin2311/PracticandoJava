/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rectangulo;

/**
 *
 * @author albin
 */
public class Rectangulo {

    public static void main(String[] args) {
       Rectangulo rectangulo1 = new Rectangulo(3, 6);
        System.out.println("Ancho: "+rectangulo1.getAncho());
        System.out.println("Largo: "+rectangulo1.getLargo());
        System.out.println("Perimetro: "+rectangulo1.calcularPerimetro());
        System.out.println("Area: "+rectangulo1.calcularArea());
    }
    
    private int Ancho;
    private int Largo;
    
    public Rectangulo(int ancho, int largo){
        this.Ancho = ancho;
        this.Largo = largo;
    }
    
    public int getAncho(){
        return Ancho;
    }
    public int getLargo(){
        return Largo;
    }
    
    public int calcularArea(){
        return Ancho*Largo;
    }
    public int calcularPerimetro(){
        return (Ancho*2)+(Largo*2);
    }
}
