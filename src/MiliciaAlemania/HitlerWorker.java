/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaAlemania;

import Milicia.*;


/**
 *
 * @author Roberto
 */
public class HitlerWorker implements AlemaniaMilicia{
    public static Hitler especialista = new Hitler();
    public static Hitler getInstance(){
        return especialista;
    }
    @Override
    public void crearMilicia() {
        especialista.setNombre("Hitler");
        especialista.setVida(30);
        especialista.setPrecio(1, 1);//diamante y gema
        especialista.setAtaque(95);
    }

    @Override
    public Berlines getBerlines() {
        return null;
    }

    @Override
    public Hitler getHitler() {
        return this.especialista;
    }
    
}