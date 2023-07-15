/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejercicios1;

import java.util.Scanner;

/**
 *
 * @author albin
 */
public class Ejercicios1 {

    public static void main(String[] args) {
        
        //nombreEdad();
        //calcularRadio();
        //Calculadora();
        //indiceMasaCorporal();
        //convertirTemperatura();
       //diasHorasMinutosSegundos();
       //calculadoraDescuentos();
    }
    
    public static void nombreEdad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        String edad = scanner.nextLine();
        System.out.println("¡Hola! "+nombre+", tu edad es "+edad);
    }
    
    public static void calcularRadio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        int radio = scanner.nextInt();
        double area= Math.PI*Math.pow(radio, 2);
        System.out.println("La circunferencia de radio: "+radio+" tiene un area de"+area);
    }
    
    public static void Calculadora(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese dos números: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        float numm1 = num1;
        float numm2 = num2;
        System.out.println("Suma: "+num1+"+"+num2+"="+(num1+num2));
        System.out.println("Resta: "+num1+"-"+num2+"="+(num1-num2));
        System.out.println("Multiplicación: "+num1+"*"+num2+"="+(num1*num2));
        System.out.println("División: "+num1+"/"+num2+"="+((numm1)/(numm2)));
    }
    
    public static void indiceMasaCorporal(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su peso en kg: ");
        double peso = scanner.nextFloat();
        System.out.println("Ingrese su altura en metros: ");
        double altura = scanner.nextFloat();
        double imc = peso/(Math.pow(altura, 2));
        System.out.println("Su IMC es: "+imc);
    }
    
    public static void convertirTemperatura(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double temp = scanner.nextDouble();
        double far = temp*9/5+32;
        System.out.println(far+" grados Fahrenheit");
    }
    
    public static void diasHorasMinutosSegundos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número de días: ");
        int dia = scanner.nextInt();
        int horas = dia*24;
        int minutos = horas*60;
        int segundos = minutos*60;
        System.out.println(dia+" dias tienen "+horas+" horas, "+minutos+" minutos y "+segundos+ " segundos");
    }
    
    public static void calculadoraDescuentos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio ");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese el porcentaje de descueneto: ");
        double descuento = scanner.nextDouble();
        double precioDescontado = precio*descuento/100;
        System.out.println("Usted tenía un costo de "+precio+", con el descuento de "+descuento+", le queda un precio de"+(precio-precioDescontado)+", descontandole un total de "+descuento);
    }
}
