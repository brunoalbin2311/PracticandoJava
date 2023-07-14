/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainanimal;

/**
 *
 * @author albin
 */
public class MainAnimal {

    public static void main(String[] args) {
        Animal animal1 = new Gato();
        Animal animal2 = new Perro();
        Animal animal3 = new Vaca();
        
        animal1.hacerSonido();
        animal2.hacerSonido();
        animal3.hacerSonido();
    }
}
