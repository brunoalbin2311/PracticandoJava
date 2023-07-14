/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainestudiante;

import java.util.ArrayList;

/**
 *
 * @author albin
 */
public class GrupoEstudiantes {
    
    private Estudiante[] estudiantes;
    private int contadorEstudiantes;
    
    public GrupoEstudiantes(int capacidad) {
        estudiantes = new Estudiante[capacidad];
        contadorEstudiantes = 0;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        if (contadorEstudiantes < estudiantes.length) {
            estudiantes[contadorEstudiantes] = estudiante;
            contadorEstudiantes++;
        } else {
            System.out.println("No se puede agregar más estudiantes. El grupo está lleno.");
        }
    }
    public Estudiante buscarEstudiante(String nombre){
        for(int i=0; i<contadorEstudiantes; i++){
            if(estudiantes[i].getNombre().equals(nombre)){
                return estudiantes[i];
            }
        }
        return null;
    }
    public void mostrarEstudiantes(){
        for(int i=0; i<contadorEstudiantes; i++){
            Estudiante estudiante = estudiantes[i];
            System.out.println("Nombre: "+estudiantes[i].getNombre()+", edad: "+estudiantes[i].getEdad());
        }
    }
}
