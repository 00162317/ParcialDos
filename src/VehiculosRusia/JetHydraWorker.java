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
public class JetHydraWorker implements RusiaVehiculos{
    public static VehiculoBase vehiculo = new VehiculoBase();
    public static VehiculoBase getInstance(){
        return vehiculo;
    }
    @Override
    public void crearVehiculo() {
        vehiculo.setNombre("Jet Hydra");
        vehiculo.setVida(25);
        vehiculo.setAtaque(100);
        vehiculo.setPrecio(1, 1);//Oro y oro
        vehiculo.setTiempoHacer(0);
        vehiculo.setTiempoLlegada(0);
    }

    @Override
    public VehiculoBase getCamioneta() {
        return null;
    }

    @Override
    public VehiculoBase getJetHydra() {
        return vehiculo;
    }
    
}