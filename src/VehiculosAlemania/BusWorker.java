/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosAlemania;

import Vehiculos.AlemaniaVehiculos;
import Vehiculos.Bus;
import Vehiculos.Tanque;

/**
 *
 * @author Roberto
 */

public class BusWorker implements AlemaniaVehiculos {
    public static Bus vehiculo = new Bus();
    public static Bus getInstance(){
        return vehiculo;
    }
    @Override
    public void crearVehiculo() {
        vehiculo.setNombre("Bus");
        vehiculo.setVida(30);
        vehiculo.setAtaque(50);
        vehiculo.setPrecio(1, 1);//Gema y carbon
        vehiculo.setTiempoHacer(0);
        vehiculo.setTiempoLlegada(0);
    }

    @Override
    public Tanque getTanque() {
        return null;
    }

    @Override
    public Bus getBus() {
        return this.vehiculo;
    }
    
}

