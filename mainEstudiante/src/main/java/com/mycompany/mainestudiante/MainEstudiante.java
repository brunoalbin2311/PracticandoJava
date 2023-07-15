/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainestudiante;

/**
 *
 * @author albin
 */
public class MainEstudiante {

    public static void main(String[] args) {
        
        GrupoEstudiantes grupo = new GrupoEstudiantes(5);

        Estudiante estudiante1 = new Estudiante("Pedro", 20);
        Estudiante estudiante2 = new Estudiante("María", 22);
        Estudiante estudiante3 = new Estudiante("Pedro", 19);

        grupo.agregarEstudiante(estudiante1);
        grupo.agregarEstudiante(estudiante2);
        grupo.agregarEstudiante(estudiante3);

        grupo.mostrarEstudiantes();

        Estudiante estudianteEncontrado = grupo.buscarEstudiante("María");
        if (estudianteEncontrado != null) {
            System.out.println("Estudiante encontrado: " + estudianteEncontrado.getNombre());
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
