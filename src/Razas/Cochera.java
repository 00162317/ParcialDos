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
public class Cochera implements CocheraPlan {
    private String nombre;
    private int vidaDefensa,capacidad,cantidad,cant,precio;
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void setVidaDefensa(int vidaDefensa) {
        this.vidaDefensa=vidaDefensa;
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
    public int getVidaDefensa() {
        return this.vidaDefensa;
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

    @Override
    public void setPrecio(int precio) {
        this.precio=precio;
    }

    @Override
    public int getPrecio() {
        return this.precio;
    }
    
}
