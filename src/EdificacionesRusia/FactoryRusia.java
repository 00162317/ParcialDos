/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesRusia;

import Razas.AbstractFactory;
import Razas.Alemania;
import Razas.Rusia;
import Razas.Usa;

/**
 *
 * @author Roberto
 */
public class FactoryRusia implements AbstractFactory{

    @Override
    public Usa getUsa(int algo) {
        return null;
    }
    /*
    1.Elbrus
    2.Kiji
    3.Kremlin
    4.Plaza Roja
    5.San Bisilo
    6.Tetriakov
    7.Volgogrado
    */
    @Override
    public Rusia getRusia(int algo) {
        switch(algo){
            case 1:
                return new ElbrusWorker();
            case 2:
                return new KijiWorker();
            case 3:
                return new KremlinWorker();
            case 4:
                return new PlazaRojaWorker();
            case 5:
                return new SanBisiloWorker();
            case 6:
                return new TetriakovWorker();
            case 7:
                return new VolgogradoWorker();
        }
        return null;
    }

    @Override
    public Alemania getAlemania(int algo) {
        return null;
    }
    
}
