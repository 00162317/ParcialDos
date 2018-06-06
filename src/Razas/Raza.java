/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;
import Razas.RazasPlan;

/**
 *
 * @author Roberto
 */
public class Raza implements RazasPlan{
    private String nombre;
    private String descripcion;
    @Override
    public void setNombreRaza(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void setDescripcionRaza(String descripcion) {
        this.descripcion=descripcion;
    }
    
}
