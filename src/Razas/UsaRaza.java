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
public interface UsaRaza {
    public void crearEdificacionRecursos();
    public void crearEdificacionEntrenamiento();
    public void crearCentroMando();
    public void crearEdificacionVehiculo();
    public EdificioBase getInstance();
    public EdificioCentroMando getInstance2();
    public EdificioEntrenar getInstance3();
    public EdificioVehiculo getInstance4();
}
