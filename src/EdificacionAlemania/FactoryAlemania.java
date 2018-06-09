/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionAlemania;

import Razas.AbstractFactory;
import Razas.Alemania;
import Razas.Rusia;
import Razas.Usa;

/**
 *
 * @author Roberto
 */
public class FactoryAlemania implements AbstractFactory{

    @Override
    public Usa getUsa(int algo) {
        return null;
    }

    @Override
    public Rusia getRusia(int algo) {
        return null;
    }

    @Override
    public Alemania getAlemania(int algo) {
        /*
        1.Bemberg
        2.Brenderburgo
        3.Dresde
        4.Europa Park
        5.Hamburgo
        6.Munich
        7.Muro Berlin
        */
        switch(algo){
            case 1:
                return new BembergWorker();
            case 2:
                return new BrenderburgoWorker();
            case 3:
                return new DresdeWorker();
            case 4:
                return new EuropaParkWorker();
            case 5:
                return new HamburgoWorker();
            case 6:
                return new MunichWorker();
            case 7:
                return new MuroBerlinWorker();
        }
        return null;
    }
    
}
