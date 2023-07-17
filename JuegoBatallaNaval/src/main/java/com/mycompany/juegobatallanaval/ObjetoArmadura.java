/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegobatallanaval;

/**
 *
 * @author albin
 */
public class ObjetoArmadura extends Objeto {
    
    public int armadura;
            
    public ObjetoArmadura(String nombre, int costo, int armadura) {
        super(nombre, costo);
        this.armadura = armadura;
    }
    
    @Override
    public void mostrarInformacion(){
        System.out.println("$"+costo+" - "+nombre+" - +"+armadura+" armor");
    }
}
