/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainfigura;

/**
 *
 * @author albin
 */
public class MainFigura {

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(3, 6);
        Triangulo triangulo = new Triangulo(3, 4);
        
        System.out.println("Circulo,  area= "+circulo.calcularArea()+", perimetro= "+circulo.calcularPerimetro());
        System.out.println("Rectangulo, area= "+rectangulo.calcularArea()+", perimetro= "+rectangulo.calcularPerimetro());
        System.out.println("Triangulo, area= "+triangulo.calcularArea()+", perimetro= "+triangulo.calcularPerimetro());
    }
}
