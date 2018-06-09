/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosUSA;

import Vehiculos.UsaVehiculos;
import Vehiculos.Moto;
import Vehiculos.Trailer;

/**
 *
 * @author Roberto
 */
public class MotoWorker implements UsaVehiculos{
    public static Moto vehiculo = new Moto();
    public static Moto getInstance(){
        return vehiculo;
    }
    @Override
    public void crearVehiculo() {
        vehiculo.setNombre("Moto Harrison");
        vehiculo.setVida(25);
        vehiculo.setAtaque(60);
        vehiculo.setPrecio(1, 1);//Moneda y rupia
        vehiculo.setTiempoHacer(0);
        vehiculo.setTiempoLlegada(0);
    }

    @Override
    public Moto getMoto() {
        return this.vehiculo;
    }

    @Override
    public Trailer getTrailer() {
        return null;
    }
    
}
