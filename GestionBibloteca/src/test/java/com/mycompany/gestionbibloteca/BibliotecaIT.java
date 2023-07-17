/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.gestionbibloteca;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author albin
 */
public class BibliotecaIT {

    @Test
    public void agregarLibroBiblioteca() {
        
        Biblioteca bibliotecaPublica = new Biblioteca();
        
        Libro libro1 = new Libro("Harry Potter", "Lionel Messi", "Acción");
        bibliotecaPublica.agregarLibro(libro1);
      
        assertTrue(bibliotecaPublica.libroEnBiblioteca(libro1));
    }
    
    @Test
    public void prestarLibro() {
        
        Biblioteca bibliotecaPublica = new Biblioteca();
        
        Libro libro1 = new Libro("Harry Potter", "Lionel Messi", "Acción");
        bibliotecaPublica.agregarLibro(libro1);
        
        bibliotecaPublica.prestarLibro(libro1);
        assertFalse(libro1.disponible); //Si el test pasa, quiere decir que libro1.disponible=false, por lo que tiene sentido ya que el libro "esta prestado"
    }
    
    @Test
    public void devolverLibroPrestado() {
        
        Biblioteca bibliotecaPublica = new Biblioteca();
        
        Libro libro1 = new Libro("Harry Potter", "Lionel Messi", "Acción");
        bibliotecaPublica.agregarLibro(libro1);
        
        bibliotecaPublica.prestarLibro(libro1); 
        bibliotecaPublica.devolverLibro(libro1);
        assertTrue(libro1.disponible); //Si el test pasa, quiere decir que libro1.disponible=true.
    }
    
    @Test
    public void eliminarLibroBiblioteca() {
        
        Biblioteca bibliotecaPublica = new Biblioteca();
        
        Libro libro1 = new Libro("Harry Potter", "Lionel Messi", "Acción");
        bibliotecaPublica.agregarLibro(libro1);
        bibliotecaPublica.eliminarLibro(libro1);
      
        assertFalse(bibliotecaPublica.libroEnBiblioteca(libro1));
    }
}