/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaUsa;

import Milicia.*;

/**
 *
 * @author Roberto
 */
public class FBIworker implements UsaMilicia{
    public static MiliciaBase tropa = new MiliciaBase();
    public static MiliciaBase getInstance(){
        return tropa;
    }
    @Override
    public void crearMilicia() {
        tropa.setNombre("Tropa FBI");
        tropa.setVida(40);
        tropa.setPrecio(1, 1);//billete y moneda
        tropa.setAtaque(80);
        tropa.setTiempo(1);
    }

    @Override
    public MiliciaBase getFBI() {
        return this.tropa;
    }

    @Override
    public MiliciaBase getDonaldTrump() {
        return null;
    }

    @Override
    public MiliciaBase getInstance2() {
        return null;
    }
    
}
