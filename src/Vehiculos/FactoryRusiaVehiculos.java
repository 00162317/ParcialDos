/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import VehiculosRusia.CamionetaWorker;
import VehiculosRusia.JetHydraWorker;

/**
 *
 * @author Roberto
 */
public class FactoryRusiaVehiculos implements AbstractFactory{

    @Override
    public AlemaniaVehiculos getAlemaniaVehiculos(int algo) {
        return null;
    }

    @Override
    public RusiaVehiculos getRusiaVehiculos(int algo) {
        switch(algo){
            case 1:
                return new CamionetaWorker();
            case 2:
                return new JetHydraWorker();
        }
       return null;
    }

    @Override
    public UsaVehiculos getUsaVehiculos(int algo) {
        return null;
    }
    
}
