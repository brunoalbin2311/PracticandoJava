/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.juegobatallanaval;

import java.util.ArrayList;

/**
 *
 * @author albin
 */
public class Campeon {
    
    public String nombre;
    public int vida;
    public int armadura;
    public String nombreAtaque;
    public int danoAtaque;
    public int oro;
    public ArrayList<Objeto> objetosComprados;
    public ArrayList<Objeto> objetosUsados;

    public Campeon(String nombre, int vida, int armadura, String nombreAtaque, int danoAtaque) {
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;
        this.nombreAtaque = nombreAtaque;
        this.danoAtaque = danoAtaque;
        this.oro = 500;
        objetosComprados = new ArrayList();
        objetosUsados = new ArrayList();
    }
    
    public void comprarObjeto(Objeto objeto){
       if(oro>objeto.costo){
           objetosComprados.add(objeto);
           oro-=objeto.costo;
           System.out.println(nombre+" compró "+objeto.nombre);
       }else{
           System.out.println("Dinero insuficiente");
       }
    }
    
    public void usarObjetoVida(Objeto objeto){
        ObjetoVida objetoVida = (ObjetoVida) objeto;
        vida+=objetoVida.vida;
        objetosComprados.remove(objeto);
        objetosUsados.add(objeto);
        System.out.println(nombre+" usó "+objeto.nombre+"  +"+objetoVida.vida+" vida");
    }
    
    public void usarObjetoAtaque(Objeto objeto){
        ObjetoAtaque objetoAtaque = (ObjetoAtaque) objeto;
        danoAtaque+=objetoAtaque.ataque;
        objetosComprados.remove(objeto);
        objetosUsados.add(objeto);
        System.out.println(nombre+" usó "+objeto.nombre+"  +"+objetoAtaque.ataque+" ataque");
    }
    
    public void usarObjetoArmadura(Objeto objeto){
        ObjetoArmadura objetoArmadura = (ObjetoArmadura) objeto;
        armadura+=objetoArmadura.armadura;
        objetosComprados.remove(objeto);
        objetosUsados.add(objeto);
        System.out.println(nombre+" usó "+objeto.nombre+"  +"+objetoArmadura.armadura+" armadura");
    }
    
    public void Atacar(Campeon atacado){
        System.out.println(nombre+" ATACÓ A "+atacado.nombre+" -"+danoAtaque);
        atacado.vida-=(danoAtaque-atacado.armadura);
        if((atacado.vida-=danoAtaque)<0){
            atacado.vida=0;
        }
        if(atacado.vida<1){
            System.out.println(atacado.nombre+" MURIÓ****************************");
            System.out.println(nombre+" +$300");
            oro+=300;
        }
    }
    
    public void mostrarInformacion(){
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(nombre+" - Vida:"+vida+" - Armadura:"+armadura+" - Ataque:"+nombreAtaque+" - Daño:"+danoAtaque+" - Oro:"+oro);
        System.out.println("Objetos listos para usar: ");
        for(Objeto i : objetosComprados){
            System.out.println(i.nombre);
        }
        if(objetosComprados.isEmpty()){
            System.out.println("No hay objetos comprados aún");
        }
        System.out.println("Objetos usados: ");
        for(Objeto i : objetosUsados){
            System.out.println(i.nombre);
        }
        if(objetosUsados.isEmpty()){
            System.out.println("No hay objetos usados aún");
        }
        System.out.println("------------------------------------------------------------------------------------------");
    }
}