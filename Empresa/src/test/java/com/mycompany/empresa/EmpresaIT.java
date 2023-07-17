/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.empresa;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author albin
 */
public class EmpresaIT {

    @Test
    public void agregarDepartamento() {
        
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento = new Departamento("Recursos Humanos");
        empresa.agregarDepartamento(departamento);
        
        Assert.assertTrue(empresa.departamentos.contains(departamento));
    }
    
    @Test
    public void contratarEmpleado() {
        
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento = new Departamento("Recursos Humanos");
        empresa.agregarDepartamento(departamento);
        
        Empleado empleado = new Empleado("Bruno Albín", 21);
        departamento.contratarEmpleado(empleado, "CEO", 100000);
        
        Assert.assertTrue(departamento.empleados.contains(empleado));
    }
    
    @Test
    public void despedirEmpleado(){
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento = new Departamento("Recursos Humanos");
        empresa.agregarDepartamento(departamento);
        
        Empleado empleado = new Empleado("Bruno Albín", 21);
        departamento.contratarEmpleado(empleado, "CEO", 100000); 
        
        departamento.despedirEmpleado(empleado);
        
        Assert.assertFalse(departamento.empleados.contains(empleado));
    }
    
    @Test
    public void mostrarInformacionEmpleado(){
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento = new Departamento("Recursos Humanos");
        empresa.agregarDepartamento(departamento);
        
        Empleado empleado = new Empleado("Bruno Albín", 21);
        departamento.contratarEmpleado(empleado, "CEO", 100000); 
        
        departamento.despedirEmpleado(empleado);
        
        empleado.mostrarInformacion();
    }
    
    @Test
    public void buscarEmpleadosPorCargo(){
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento = new Departamento("Recursos Humanos");
        empresa.agregarDepartamento(departamento);
        
        Empleado empleado1 = new Empleado("Bruno Albín", 21);
        Empleado empleado2 = new Empleado("Julian Petero", 22);
        Empleado empleado3 = new Empleado("Facundo Medeiros", 20);
        departamento.contratarEmpleado(empleado1, "CEO", 100000); 
        departamento.contratarEmpleado(empleado2, "Gerente", 50000); 
        departamento.contratarEmpleado(empleado3, "Gerente", 40000); 
        
        departamento.buscarEmpleadoPorCargo("Gerente");
    }
    
    @Test
    public void buscarEmpleadosPorNombre(){
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento = new Departamento("Recursos Humanos");
        empresa.agregarDepartamento(departamento);
        
        Empleado empleado1 = new Empleado("Bruno Albín", 21);
        Empleado empleado2 = new Empleado("Julian Petero", 22);
        Empleado empleado3 = new Empleado("Facundo Medeiros", 20);
        departamento.contratarEmpleado(empleado1, "CEO", 100000); 
        departamento.contratarEmpleado(empleado2, "Gerente", 50000); 
        departamento.contratarEmpleado(empleado3, "Recepcionista", 40000); 
        
        departamento.buscarEmpleadoPorNombre("Bruno Albín");
    }
    
    @Test
    public void mostrarInformacionDepartamento(){
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento = new Departamento("Recursos Humanos");
        empresa.agregarDepartamento(departamento);
        
        Empleado empleado1 = new Empleado("Bruno Albín", 21);
        Empleado empleado2 = new Empleado("Julian Petero", 22);
        Empleado empleado3 = new Empleado("Facundo Medeiros", 20);
        departamento.contratarEmpleado(empleado1, "CEO", 100000); 
        departamento.contratarEmpleado(empleado2, "Gerente", 50000); 
        departamento.contratarEmpleado(empleado3, "Recepcionista", 40000); 
        
        departamento.mostrarInformacion();
    }
    
    @Test
    public void calcularSalarioDepartamento(){
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento = new Departamento("Recursos Humanos");
        empresa.agregarDepartamento(departamento);
        
        Empleado empleado1 = new Empleado("Bruno Albín", 21);
        Empleado empleado2 = new Empleado("Julian Petero", 22);
        Empleado empleado3 = new Empleado("Facundo Medeiros", 20);
        departamento.contratarEmpleado(empleado1, "CEO", 100000); 
        departamento.contratarEmpleado(empleado2, "Gerente", 50000); 
        departamento.contratarEmpleado(empleado3, "Recepcionista", 40000); 
        
        int expected = empleado1.salario + empleado2.salario + empleado3.salario;
        int salarioTotal = departamento.calcularSalarioTotal();
        
        Assert.assertEquals(expected, salarioTotal);
    }
    
    @Test
    public void eliminarDepartamento(){
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento = new Departamento("Recursos Humanos");
        empresa.agregarDepartamento(departamento);
        
        empresa.eliminarDepartamento(departamento);
        
        Assert.assertFalse(empresa.departamentos.contains(departamento));
    }
    
    @Test
    public void mostrarDepartamentos(){
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento1 = new Departamento("Recursos Humanos");
        Departamento departamento2 = new Departamento("Contabilidad");
        Departamento departamento3 = new Departamento("Marketing");
        Departamento departamento4 = new Departamento("Informática");
        
        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento2);
        empresa.agregarDepartamento(departamento3);
        empresa.agregarDepartamento(departamento4);
        
        empresa.mostrarDepartamentos();
    }
    
    @Test
    public void buscarEmpleado(){
        Empresa empresa = new Empresa("Apple");
        
        Departamento departamento1 = new Departamento("Recursos Humanos");
        Departamento departamento2 = new Departamento("Marketing");
        empresa.agregarDepartamento(departamento1);
        empresa.agregarDepartamento(departamento1);
        
        Empleado empleado1 = new Empleado("Bruno Albín", 21);
        Empleado empleado2 = new Empleado("Julian Petero", 22);
        Empleado empleado3 = new Empleado("Facundo Medeiros", 20);
        
        departamento1.contratarEmpleado(empleado1, "CEO", 100000); 
        departamento1.contratarEmpleado(empleado2, "Gerente", 50000); 
        departamento2.contratarEmpleado(empleado3, "Recepcionista", 40000); 
        
        empresa.buscarEmpleadoEnEmpresa("Bruno Albín", departamento1);
    }
    
    @Test
    public void calcularSalarioTotalEmpresa(){
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
        
        int expected = empleado1.salario + empleado2.salario + empleado3.salario + empleado4.salario + empleado5.salario + empleado6.salario + empleado7.salario;
        int salarioTotal = empresa.calcularSalarioTotalEmpresa();
        
        Assert.assertEquals(expected, salarioTotal);
    }
    
    @Test
    public void mostrarInformacionEmpresa(){
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
}
