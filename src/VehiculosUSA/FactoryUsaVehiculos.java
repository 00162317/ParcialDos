/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosUSA;
import Vehiculos.AbstractFactory;
import Vehiculos.UsaVehiculos;
import Vehiculos.RusiaVehiculos;
import Vehiculos.AlemaniaVehiculos;
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
    /*
    1.
    2.
    */
    @Override
    public UsaVehiculos getUsaVehiculos(int algo) {
             switch(algo){
            
        }
        return null;
    }

 }