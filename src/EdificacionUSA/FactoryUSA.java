/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionUSA;

import Razas.AbstractFactory;
import Razas.Alemania;
import Razas.Rusia;
import Razas.Usa;

/**
 *
 * @author Roberto
 */
public class FactoryUSA implements AbstractFactory{

    @Override
    public Usa getUsa(String type) {
        switch(type){
            case "DisneyLand":
                return new DisneyLandWorker();
            case "Casa Blanca":
                return new CasaBlancaWorker();
            case "Empire State":
                return new EmpireStateWorker();
            case "Estatua Libertad":
                return new EstatuaLibertadWorker();
            case "Golden State":
                return new GoldeStateWorker();
            case "Gran Canion":
                return new GranCanionWorker();
            case "Torres Gemelas":
                return new TorresGemelasWorker();
        }
        return null;
    }

    @Override
    public Rusia getRusia(String type) {
        return null;
    }

    @Override
    public Alemania getAlemania(String type) {
        return null;
    }
    
}
