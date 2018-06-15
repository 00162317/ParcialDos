/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import VehiculosUSA.MotoWorker;
import VehiculosUSA.TrailerWorker;

/**
 *
 * @author Roberto
 */
public class FactoryUsaVehiculos implements AbstractFactory{

    @Override
    public AlemaniaVehiculos getAlemaniaVehiculos(int algo) {
        return null;
    }

    @Override
    public RusiaVehiculos getRusiaVehiculos(int algo) {
        return null;
    }

    @Override
    public UsaVehiculos getUsaVehiculos(int algo) {
        switch(algo){
            case 1:
                return new MotoWorker();
            case 2:
                return new TrailerWorker();
        }
      return null;  
    }
    
}
