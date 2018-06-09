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

    /*
    1.DisneyLand
    2.Casa Blanca
    3.EmpireState
    4.Estatua Libertad
    5.Golden State
    6.Gran Canion
    7.Torres Gemelas
    */
    @Override
    public Usa getUsa(int algo) {
        switch(algo){
            case 1:
                return new DisneyLandWorker();
            case 2:
                return new CasaBlancaWorker();
            case 3:
                return new EmpireStateWorker();
            case 4:
                return new EstatuaLibertadWorker();
            case 5:
                return new GoldeStateWorker();
            case 6:
                return new GranCanionWorker();
            case 7:
                return new TorresGemelasWorker();
        }
        return null;
    }

    @Override
    public Rusia getRusia(int algo) {
        return null;
    }

    @Override
    public Alemania getAlemania(int algo) {
        return null;
    }
    
}
