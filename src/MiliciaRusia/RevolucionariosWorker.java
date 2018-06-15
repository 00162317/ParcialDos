/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaRusia;

import Milicia.*;

/**
 *
 * @author Roberto
 */
public class RevolucionariosWorker implements RusiaMilicia{
    public static MiliciaBase tropa = new MiliciaBase();
    public static MiliciaBase getInstance(){
        return tropa;
    }
    @Override
    public void crearMilicia() {
        tropa.setNombre("Tropa Revolucionarios");
        tropa.setVida(50);
        tropa.setPrecio(1, 1);//oror y plata
        tropa.setAtaque(80);
        tropa.setTiempo(1);
    }

    @Override
    public MiliciaBase getRevolucionarios() {
        return this.tropa;
    }

    @Override
    public MiliciaBase getTenientePutin() {
        return null;
    }

    @Override
    public MiliciaBase getInstance2() {
        return null;
    }
    
}
