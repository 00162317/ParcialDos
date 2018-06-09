/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosRusia;
import Vehiculos.AbstractFactory;
import Vehiculos.UsaVehiculos;
import Vehiculos.RusiaVehiculos;
import Vehiculos.AlemaniaVehiculos;
/**
 *
 * @author Roberto
 */
public class FactoryRusiaVehiculos implements AbstractFactory{

    @Override
    public AlemaniaVehiculos getAlemaniaVehiculos(int algo) {
        return null;
    }
    /*
    1.Camioneta
    2.Jey Hydra
    */
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
