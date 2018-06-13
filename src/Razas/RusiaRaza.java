/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

/**
 *
 * @author Roberto
 */
public interface RusiaRaza {
     public void crearEdificacionRecursos();
    public void crearEdificacionEntrenamiento();
    public void crearEdificacionVehiculo();
    public void crearCentroMando();
    public EdificioBase getInstance();
       public EdificioCentroMando getInstance2();
    public EdificioEntrenar getInstance3();
    public EdificioVehiculo getInstance4();
}
