/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.gestiondeproductos;

/**
 *
 * @author albin
 */
public class GestionDeProductos {

    public static void main(String[] args) {
        
        // Crear productos simples
        ProductoSimple producto1 = new ProductoSimple("Camiseta", 25.99);
        ProductoSimple producto2 = new ProductoSimple("Pantalón", 39.99);
        
        // Crear producto compuesto
        ProductoCompuesto productoCompuesto = new ProductoCompuesto("Conjunto", 59.99);
        productoCompuesto.agregarProductoSimple(producto1);
        productoCompuesto.agregarProductoSimple(producto2);
        
        // Crear factura
        GestorProductos factura = new GestorProductos();
        factura.agregarProducto(producto1);
        factura.agregarProducto(productoCompuesto);
        
        // Mostrar detalles de la factura
        factura.mostrarProductos();
        System.out.println(factura.calcularPrecioTotal());
    }
}
