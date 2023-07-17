/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeproductos;

/**
 *
 * @author albin
 */
public abstract class ProductoBase implements Producto {
    
    private String descripcion;
    private double precio;

    public ProductoBase(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
}
