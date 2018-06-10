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
public class BerlinesWorker implements AlemaniaMilicia{
    public static Berlines tropa = new Berlines();
    public static Berlines getInstance(){
        return tropa;
    }
    @Override
    public void crearMilicia() {
         tropa.setNombre("Berlines");
        tropa.setVida(40);
        tropa.setPrecio(1, 1);//diamante y carbon
        tropa.setAtaque(90);
    }

    @Override
    public Berlines getBerlines() {
        return this.tropa;
    }

    @Override
    public Hitler getHitler() {
        return null;
    }
    
}
