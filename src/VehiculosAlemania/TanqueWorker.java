/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosAlemania;
import Vehiculos.AlemaniaVehiculos;
import Vehiculos.*;
/**
 *
 * @author Roberto
 */
public class TanqueWorker implements AlemaniaVehiculos {
    public static VehiculoBase vehiculo = new VehiculoBase();
    public static VehiculoBase getInstance(){
        return vehiculo;
    }
    @Override
    public void crearVehiculo() {
        vehiculo.setNombre("Tanque");
        vehiculo.setVida(60);
        vehiculo.setAtaque(90);
        vehiculo.setPrecio(1, 1);//Diamante y gema
        vehiculo.setTiempoHacer(0);
        vehiculo.setTiempoLlegada(0);
    }

    @Override
    public VehiculoBase getTanque() {
        return this.vehiculo;
    }

    @Override
    public VehiculoBase getBus() {
        return null;
    }

    @Override
    public VehiculoBase getInstance2() {
        return null;
    }
    
}
