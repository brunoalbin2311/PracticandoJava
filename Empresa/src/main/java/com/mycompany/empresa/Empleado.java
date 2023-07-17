/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

/**
 *
 * @author albin
 */
public class Empleado {
    
    public String nombre;
    public int edad;
    public int salario = 0;
    public String cargo;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " Edad: " + edad + " Salario: $" + salario + " Cargo: " + cargo);
    }
}
