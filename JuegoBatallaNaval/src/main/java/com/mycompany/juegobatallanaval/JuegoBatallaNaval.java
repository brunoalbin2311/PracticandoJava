/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.juegobatallanaval;

/**
 *
 * @author albin
 */
public class JuegoBatallaNaval {

    public static void main(String[] args) {
        
        //Creación de la tienda y los objetos disponibles.
        
        Tienda tienda = new Tienda();
        
        Objeto espada = new ObjetoAtaque("Espada", 300, 30);
        Objeto arco = new ObjetoAtaque("Arco", 400, 40);
        Objeto martillo = new ObjetoAtaque("Martillo", 250, 30);
        Objeto lanza = new ObjetoAtaque("Lanza", 500, 60);
        
        Objeto casco = new ObjetoArmadura("Casco", 200, 5);
        Objeto botas = new ObjetoArmadura("Botas", 100, 2);
        Objeto capa = new ObjetoArmadura("Capa", 250, 3);
        Objeto pechera = new ObjetoArmadura("Pechera", 300, 7);
        
        Objeto pocion = new ObjetoVida("Pocion", 50, 100);
        Objeto venda = new ObjetoVida("Venda", 20, 20);
        Objeto botiquin = new ObjetoVida("Botiquin", 200, 200);
        Objeto perifar = new ObjetoVida("Perifar", 30, 60);
        
        tienda.agregarObjeto(espada);
        tienda.agregarObjeto(arco);
        tienda.agregarObjeto(martillo);
        tienda.agregarObjeto(lanza);
        
        tienda.agregarObjeto(casco);
        tienda.agregarObjeto(botas);
        tienda.agregarObjeto(capa);
        tienda.agregarObjeto(pechera);
        
        tienda.agregarObjeto(pocion);
        tienda.agregarObjeto(venda);
        tienda.agregarObjeto(botiquin);
        tienda.agregarObjeto(perifar);
        
        
        //Creacion los campeones.
        
        Campeon renek = new Campeon("Renekton", 650, 5, "Cuchilla feroz", 20);
        Campeon nasus = new Campeon("Nasus", 550, 7, "Golpe infernal", 22);
        
        renek.mostrarInformacion();
        nasus.mostrarInformacion();

        //SIMULACRO PELEEAAAAAAAAAAAAAAAAAAA
        
        nasus.comprarObjeto(casco);
        nasus.usarObjetoArmadura(casco);
        renek.comprarObjeto(perifar);
        renek.usarObjetoVida(perifar);
  
        renek.Atacar(nasus);
        nasus.Atacar(renek);
        
        renek.comprarObjeto(espada);
        renek.usarObjetoAtaque(espada);
        
        renek.Atacar(nasus);
        renek.Atacar(nasus);
        nasus.Atacar(renek);
        
        nasus.comprarObjeto(martillo);
        nasus.usarObjetoAtaque(martillo);
        renek.comprarObjeto(botas);
        renek.usarObjetoArmadura(botas);
        
        nasus.Atacar(renek);
        nasus.Atacar(renek);
     
        nasus.comprarObjeto(venda);
        nasus.usarObjetoVida(venda);
        
        nasus.Atacar(renek);
        renek.Atacar(nasus);
        renek.Atacar(nasus);
        renek.Atacar(nasus);
        nasus.Atacar(renek);
        renek.Atacar(nasus);
        
        nasus.comprarObjeto(perifar);
        nasus.usarObjetoVida(perifar);
        
        nasus.Atacar(renek);
        nasus.Atacar(renek);
        renek.Atacar(nasus);
        
        renek.mostrarInformacion();
        nasus.mostrarInformacion();
    }
}
