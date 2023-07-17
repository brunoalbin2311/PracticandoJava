/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegobatallanaval;

/**
 *
 * @author albin
 */
public class ObjetoAtaque extends Objeto {
    
    public int ataque;
            
    public ObjetoAtaque(String nombre, int costo, int ataque) {
        super(nombre, costo);
        this.ataque = ataque;
    }
    
    public void mostrarInformacion(){
        System.out.println("$"+costo+" - "+nombre+" - +"+ataque+" daño");
    }
}
