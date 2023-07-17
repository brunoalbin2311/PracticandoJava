/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.empresa;

import java.util.ArrayList;

/**
 *
 * @author albin
 */
public class Empresa {

    public static void main(String[] args) {
      
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento1 = new Departamento("Recursos Humanos");
        Departamento departamento2 = new Departamento("Marketing");
        Departamento departamento3 = new Departamento("Informática");
        
        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento2);
        empresa.agregarDepartamento(departamento3);
        
        Empleado empleado1 = new Empleado("Bruno Albín", 21);
        Empleado empleado2 = new Empleado("Julian Petero", 22);
        Empleado empleado3 = new Empleado("Mondongo", 40);
        Empleado empleado4 = new Empleado("Pepito", 80);
        Empleado empleado5 = new Empleado("Frutillita", 16);
        Empleado empleado6 = new Empleado("Messi", 36);
        Empleado empleado7 = new Empleado("El chengue", 34);
        
        departamento1.contratarEmpleado(empleado1, "Gerente", 100000); 
        departamento1.contratarEmpleado(empleado2, "Recepcionista", 40000); 
        departamento2.contratarEmpleado(empleado3, "Gerente", 100000); 
        departamento2.contratarEmpleado(empleado4, "Recepcionista", 40000); 
        departamento3.contratarEmpleado(empleado5, "Gerente", 100000); 
        departamento3.contratarEmpleado(empleado6, "Recepcionista", 40000);
        departamento3.contratarEmpleado(empleado7, "CEO", 200000); 
        
        empresa.mostrarInformacionEmpresa();
    }
    
    public String nombre;
    public ArrayList<Departamento> departamentos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        departamentos = new ArrayList();
    }
    
    public void agregarDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }
    
    public void eliminarDepartamento(Departamento departamento){
        departamentos.remove(departamento);
    }
    
    public void mostrarDepartamentos(){
        System.out.println("-------------------------");
        for(Departamento i : departamentos){
            System.out.println(i.nombre);
        }
        System.out.println("-------------------------");
    }
    
    public void buscarEmpleadoEnEmpresa(String nombre, Departamento departamento){
        for(Empleado i : departamento.empleados){
            if(i.nombre.equals(nombre)){
                i.mostrarInformacion();
            }
        }
    }
    
    public int calcularSalarioTotalEmpresa(){
        int salariosTotales = 0;
        for(Departamento j : departamentos){
            for(Empleado i : j.empleados){
            salariosTotales+=i.salario;
            }
        }
        return salariosTotales;
    }
    
    public void mostrarInformacionEmpresa(){
        System.out.println("****************************************************");
        System.out.println("Informacion de la empresa "+this.nombre);
        System.out.println("****************************************************");
        for(Departamento j : departamentos){
            System.out.println("-------------------------");
            System.out.println("Departamento de "+j.nombre);
            System.out.println("Empleados: ");
            for(Empleado i : j.empleados){
            System.out.println("Nombre: "+i.nombre+", Cargo: "+i.cargo+", Salario: $"+i.salario);
            }
            System.out.println("");
            System.out.println("Salario total del departamento: $"+j.calcularSalarioTotal());
        }
        System.out.println("");
        System.out.println("Salario total de la empresa: $"+calcularSalarioTotalEmpresa());
        System.out.println("****************************************************");
    }
}
