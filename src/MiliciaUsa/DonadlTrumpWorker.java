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
    public static DonaldTrump especialista = new DonaldTrump();
    public static DonaldTrump getInstance(){
        return especialista;
    }
    @Override
    public void crearMilicia() {
        especialista.setNombre("Especialista Donald Trump");
        especialista.setVida(40);
        especialista.setPrecio(1, 1);//billete y rupia
        especialista.setAtaque(75);
    }

    @Override
    public FBI getFBI() {
        return null;
    }

    @Override
    public DonaldTrump getDonaldTrump() {
        return this.especialista;
    }
    
}