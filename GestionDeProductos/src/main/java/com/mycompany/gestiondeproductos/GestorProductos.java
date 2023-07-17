/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeproductos;

import java.util.ArrayList;

/**
 *
 * @author albin
 */
public class GestorProductos {
    
    public ArrayList<ProductoBase> productosBase;
    
    public GestorProductos(){
        productosBase = new ArrayList();
    }
    
    public void agregarProducto(ProductoBase producto){
        productosBase.add(producto);
    }
    
    public void mostrarProductos(){
        for (ProductoBase i : productosBase){
            System.out.println(i.getDescripcion());
        }
    }
    
    public double calcularPrecioTotal(){
        int precio = 0;
        for (ProductoBase i : productosBase){
            precio+=i.getPrecio();
        }
        return precio;
    }
}
