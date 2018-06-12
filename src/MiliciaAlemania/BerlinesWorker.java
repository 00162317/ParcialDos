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
    public static MiliciaBase tropa = new MiliciaBase();
    public static MiliciaBase getInstance(){
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
    public MiliciaBase getBerlines() {
        return this.tropa;
    }

    @Override
    public MiliciaBase getHitler() {
        return null;
    }
    
}
