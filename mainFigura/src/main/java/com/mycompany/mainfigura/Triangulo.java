/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainfigura;

/**
 *
 * @author albin
 */
public class Triangulo implements Figura{
    
    private int Base;
    private int Altura;
    
    public Triangulo(int base, int altura){
        this.Base = base;
        this.Altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (Base*Altura)/2;
    }
    
    @Override
    public double calcularPerimetro(){
        return Base*3;
    }
}
