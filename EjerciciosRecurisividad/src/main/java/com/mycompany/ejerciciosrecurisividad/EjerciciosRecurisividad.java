/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciosrecurisividad;

/**
 *
 * @author albin
 */
public class EjerciciosRecurisividad {

    public static void main(String[] args) {
        //System.out.println(sumaNumeros(6));
        //System.out.println(Factorial(6));
        //System.out.println(Fibonacci(6));
        //System.out.println(Potencia(2, 4));
        //conteoRegresivo(5);
        //System.out.println(sumaDigitos(1234));
        //System.out.println(conteoDigitos(12345));
        //System.out.println(cadenaInvertida("holisss"));
        imprimirSecuencia(5);
    }
    
    public static int sumaNumeros(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+sumaNumeros(n-1);
        }
    }
    
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
    
    public static int Fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    
    public static int Potencia(int base, int exp){
        if(exp==0){
            return 1;
        }else{
            return base*Potencia(base, exp-1);
        }
    }
    
    public static void conteoRegresivo(int n){
        if(n>0){
            System.out.println(n);
            conteoRegresivo(n-1);
        }else{
            System.out.println("Despegue!");
        }
    }
    
    public static int sumaDigitos(int n){
        if(n<10){
            return n;
        }else{
            return n%10+sumaDigitos(n/10);
        }
    }
    
    public static int conteoDigitos(int n){
        if(n<10){
            return 1;
        }else{
            return 1+conteoDigitos(n/10);
        }
    }
    
    public static String cadenaInvertida(String cadena){
        if(cadena.isEmpty()){
            return cadena;
        }else{
            char primer = cadena.charAt(0);
            String restoCadena = cadena.substring(1);
            String cadenaDadaVuelta = cadenaInvertida(restoCadena);
            return cadenaDadaVuelta+primer;
        }
    }
    
    public static void imprimirSecuencia(int n){
        if(n>1){
            System.out.println(n);
            imprimirSecuencia(n-1);
        }else{
            System.out.println(n);
        }
    }
}