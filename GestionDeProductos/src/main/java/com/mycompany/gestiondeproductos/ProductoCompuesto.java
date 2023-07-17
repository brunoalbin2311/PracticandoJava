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
public class ProductoCompuesto extends ProductoBase {
    
    public ArrayList<ProductoSimple> productosSimples;
    
    public ProductoCompuesto(String descripcion, double precio) {
        super(descripcion, precio);
        productosSimples = new ArrayList(); 
    }
    
    public void agregarProductoSimple(ProductoSimple productoSimple){
        productosSimples.add(productoSimple);
    }
}