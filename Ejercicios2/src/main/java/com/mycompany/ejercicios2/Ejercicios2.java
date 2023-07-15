/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicios2;

import java.util.Scanner;

/**
 *
 * @author albin
 */
public class Ejercicios2 {

    public static void main(String[] args) {
        Ejercicios2 objeto2 = new Ejercicios2();
        
        //tablaHastaDies();
        //encontrarMayorArray();
        //System.out.println(frasePalindroma());
        //System.out.println(sumaCifras());
    }
    
    public static void tablaHastaDies(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        for(int i=1; i<11; i++){
            System.out.println(i+"*"+numero+"="+(numero*i));
        }
    }
    
    public static void encontrarMayorArray(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la candidad de elementos del array: ");
        int cantidad = scanner.nextInt();
        
        int[] array = new int[cantidad];
        for(int i = 0; i<cantidad; i++){
            System.out.println("Ingrese un valor para poder insertar en el array: ");
            array[i] = scanner.nextInt();
        }
        int mayor = Integer.MIN_VALUE;
        for(int i = 0; i<cantidad; i++){
            if(array[i]>mayor){
                mayor = array[i];
            }
        }
        System.out.println("El valor mayor es: "+mayor);
    }
    
    public static boolean frasePalindroma(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String frase = scanner.nextLine();
        String fraseSinEspacios = frase.replace(" ", "").toLowerCase();
        
        for(int i = 0; i<fraseSinEspacios.length()-1; i++){
            if(fraseSinEspacios.charAt(i)!=fraseSinEspacios.charAt(fraseSinEspacios.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    
    public static int sumaCifras(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        int suma=0;
        while(numero>0){
            suma+=numero%10;
            numero/=10;
        }
        return suma;
    }
}
