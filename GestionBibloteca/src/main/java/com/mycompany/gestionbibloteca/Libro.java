/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbibloteca;

/**
 *
 * @author albin
 */
public class Libro {
    
    public String nombre;
    public String autor;
    public String categoria;
    public boolean disponible;
    
    public Libro(String nombre, String autor, String categoria){
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.disponible = true;
    }
    
    public void getInformación(){
        System.out.println("-------------------------");
        System.out.println("Nombre: "+nombre);
        System.out.println("Autor: "+autor);
        System.out.println("Categoría: "+categoria);
        if(disponible){
            System.out.println("DISPONIBLE");
        }else{
            System.out.println("NO DISPONIBLE");
        }
    }
}
