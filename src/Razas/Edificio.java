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
public class Edificio implements EdificioPlan{
    private String nombre;
    private int vida,capacidad,cantidad,cant;
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setCapacidad(int capacidad) {
        this.capacidad=capacidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad=cantidad;
    }

    @Override
    public void setCantxTurno(int cant) {
        this.cant=cant;
    }

    @Override
    public String getNombre() {
       return this.nombre;
    }

    @Override
    public int getVida() {
        return this.vida;
    }

    @Override
    public int getCapacidad() {
        return this.capacidad;
    }

    @Override
    public int getCantidad() {
        return this.cantidad;
    }

    @Override
    public int getCantxTurno() {
        return this.cant;
    }
    
}