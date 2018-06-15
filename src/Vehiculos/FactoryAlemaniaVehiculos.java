/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import VehiculosAlemania.BusWorker;
import VehiculosAlemania.TanqueWorker;

/**
 *
 * @author Roberto
 */
public class FactoryAlemaniaVehiculos implements AbstractFactory{

    @Override
    public AlemaniaVehiculos getAlemaniaVehiculos(int algo) {
        switch(algo){
            case 1:
                return new BusWorker();
            case 2:
                return new TanqueWorker();
        }
        return null;
    }

    @Override
    public RusiaVehiculos getRusiaVehiculos(int algo) {
        return null;
    }

    @Override
    public UsaVehiculos getUsaVehiculos(int algo) {
        return null;
    }
    
}
