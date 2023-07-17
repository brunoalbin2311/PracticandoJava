/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa;

import java.util.ArrayList;

/**
 *
 * @author albin
 */
public class Departamento {
    
    public String nombre;
    
    public ArrayList<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
    }
    
    public void contratarEmpleado(Empleado empleado, String cargo, int salario){
        empleado.setCargo(cargo);
        empleado.setSalario(salario);
        empleados.add(empleado);
    }
    
    public void despedirEmpleado(Empleado empleado){
        empleados.remove(empleado);
    }
    
    public void buscarEmpleadoPorNombre(String nombre){
        System.out.println("---------------------------");
       for(Empleado i : empleados){
           if(i.nombre.equals(nombre)){
               i.mostrarInformacion();
           }
       }
       System.out.println("---------------------------");
    }
    
    public void buscarEmpleadoPorCargo(String cargo){
       System.out.println("---------------------------");
        for(Empleado i : empleados){
           if(i.cargo.equals(cargo)){
               i.mostrarInformacion();
           }
       }
       System.out.println("---------------------------");
    }
    
    public int calcularSalarioTotal(){
        int salario = 0;
        for(Empleado i : empleados){
           salario+=i.salario;
       }
       return salario;
    }
    
    public void mostrarInformacion(){
        System.out.println("---------------------------");
        System.out.println("Departamento de "+this.nombre);
        System.out.println("Empleados: ");
        for(Empleado i : empleados){
            System.out.println("Nombre: "+i.nombre+", Cargo: "+i.cargo+", Salario: $"+i.salario);
        }
        System.out.println("");
        System.out.println("Total Salarios: $"+calcularSalarioTotal());
        System.out.println("---------------------------");
    }
}
