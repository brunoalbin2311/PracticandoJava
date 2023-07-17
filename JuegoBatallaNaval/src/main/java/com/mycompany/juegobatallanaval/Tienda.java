/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegobatallanaval;

import java.util.ArrayList;

/**
 *
 * @author albin
 */
public class Tienda {
    
    public ArrayList<Objeto> objetos;
    
    
    public Tienda(){
        objetos = new ArrayList();
    }
    
    public void agregarObjeto(Objeto objeto){
        objetos.add(objeto);
    }
    
    public void mostrarObjetos(){
        System.out.println("***********************");
        for(Objeto i : objetos){
            i.mostrarInformacion();
        }
    }
}
