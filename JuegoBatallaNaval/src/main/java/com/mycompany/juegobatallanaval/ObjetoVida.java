/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegobatallanaval;

/**
 *
 * @author albin
 */
public class ObjetoVida extends Objeto {
    
    public int vida;
            
    public ObjetoVida(String nombre, int costo, int vida) {
        super(nombre, costo);
        this.vida = vida;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("$"+costo+" - "+nombre+" - +"+vida+" vida");
    }
}
