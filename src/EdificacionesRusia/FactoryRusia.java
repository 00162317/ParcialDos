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
    public Usa getUsa(String type) {
        return null;
    }

    @Override
    public Rusia getRusia(String type) {
        switch(type){
            case "Elbrus":
                return new ElbrusWorker();
            case "Kiji":
                return new KijiWorker();
            case "Kremlin":
                return new KremlinWorker();
            case "Plaza Roja":
                return new PlazaRojaWorker();
            case "San Bisilo":
                return new SanBisiloWorker();
            case "Tetriakov":
                return new TetriakovWorker();
            case "Volgogrado":
                return new VolgogradoWorker();
        }
        return null;
    }

    @Override
    public Alemania getAlemania(String type) {
        return null;
    }
    
}
