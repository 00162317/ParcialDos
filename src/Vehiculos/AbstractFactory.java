/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Roberto
 */
public interface AbstractFactory {
    AlemaniaVehiculos getAlemaniaVehiculos(int algo);
    RusiaVehiculos getRusiaVehiculos(int algo);
    UsaVehiculos getUsaVehiculos(int algo);
}