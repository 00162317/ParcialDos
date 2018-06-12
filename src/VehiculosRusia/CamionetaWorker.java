/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VehiculosRusia;
import Vehiculos.RusiaVehiculos;
import Vehiculos.*;
/**
 *
 * @author Roberto
 */
public class CamionetaWorker implements RusiaVehiculos{
    public static VehiculoBase vehiculo = new VehiculoBase();
    public static VehiculoBase getInstance(){
        return vehiculo;
    }
    @Override
    public void crearVehiculo() {
        vehiculo.setNombre("Camioneta");
        vehiculo.setVida(75);
        vehiculo.setAtaque(50);
        vehiculo.setPrecio(1, 1);//Oro y bronce
        vehiculo.setTiempoHacer(0);
        vehiculo.setTiempoLlegada(0);
    }

    @Override
    public VehiculoBase getCamioneta() {
        return this.vehiculo;
    }

    @Override
    public VehiculoBase getJetHydra() {
        return null;
    }
    
}
