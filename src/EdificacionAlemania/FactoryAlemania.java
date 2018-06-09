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
    public Usa getUsa(String type) {
        return null;
    }

    @Override
    public Rusia getRusia(String type) {
        return null;
    }

    @Override
    public Alemania getAlemania(String type) {
        switch(type){
            case "Bemberg":
                return new BembergWorker();
            case "Brenderburgo":
                return new BrenderburgoWorker();
            case "Dresde":
                return new DresdeWorker();
            case "Europa Park":
                return new EuropaParkWorker();
            case "Hamburgo":
                return new HamburgoWorker();
            case "Munich":
                return new MunichWorker();
            case "Muro Berlin":
                return new MuroBerlinWorker();
        }
        return null;
    }
    
}
