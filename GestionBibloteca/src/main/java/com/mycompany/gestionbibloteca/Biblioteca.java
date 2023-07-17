/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionbibloteca;

import java.util.ArrayList;

/**
 *
 * @author albin
 */
public class Biblioteca {
    
    private ArrayList<Libro> libros = new ArrayList();
    
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void eliminarLibro(Libro libro){
        if(libros.contains(libro)){
            libros.remove(libro);
        }else{
            System.out.println("Libro no encontrado!");
        }
    }
    
    public void prestarLibro(Libro libro){
        if(libros.contains(libro)){
            libro.disponible = false;
        }else{
            System.out.println("Libro no encontrado!");
        }
    }
    
    public void devolverLibro(Libro libro){
        if(libros.contains(libro)){
            libro.disponible = true;
        }else{
            System.out.println("Libro no encontrado!");
        }
    }
    
    public void mostrarTodos(){
        for(Libro i : libros){
            i.getInformación();
        }
    }
    
    public void filtarCategoria(String categoria){
        for( Libro i : libros){
            if(i.categoria.equals(categoria)){
                i.getInformación();
            }
        }
    }
    
    public void filtarAutor(String autor){
        for( Libro i : libros){
            if(i.autor.equals(autor)){
                i.getInformación();
            }
        }
    }
    
    public boolean libroEnBiblioteca(Libro libro){
        return libros.contains(libro);
    }
}
