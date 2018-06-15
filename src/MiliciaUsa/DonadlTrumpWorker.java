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
public class DonadlTrumpWorker implements UsaMilicia{
    public static MiliciaBase especialista = new MiliciaBase();
    public static MiliciaBase getInstance(){
        return especialista;
    }
    @Override
    public void crearMilicia() {
        especialista.setNombre("Especialista Donald Trump");
        especialista.setVida(40);
        especialista.setPrecio(1, 1);//billete y rupia
        especialista.setAtaque(75);
        especialista.setTiempo(2);
    }

    @Override
    public MiliciaBase getFBI() {
        return null;
    }

    @Override
    public MiliciaBase getDonaldTrump() {
        return this.especialista;
    }

    @Override
    public MiliciaBase getInstance2() {
        return null;
    }
    
}