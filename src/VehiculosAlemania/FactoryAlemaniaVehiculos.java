/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosAlemania;
import Vehiculos.AbstractFactory;
import Vehiculos.UsaVehiculos;
import Vehiculos.RusiaVehiculos;
import Vehiculos.AlemaniaVehiculos;
/**
 *
 * @author Roberto
 */
public class FactoryAlemaniaVehiculos implements AbstractFactory{
    /*
    1.Bus
    2.Tanque
    */
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
