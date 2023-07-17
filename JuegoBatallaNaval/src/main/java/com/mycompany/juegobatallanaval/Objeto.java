/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegobatallanaval;

/**
 *
 * @author albin
 */
public abstract class Objeto {
    
    public String nombre;
    public int costo;

    public Objeto(String nombre, int costo) {
        this.nombre = nombre;
        this.costo = costo;
    }
    
    public void mostrarInformacion(){
        System.out.println("$"+costo+" - "+nombre);
    }
}
