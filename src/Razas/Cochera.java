/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;

import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class Cochera implements EdificacionesPlan{
    private String nombre;
    private int vida,capacidad,cantidad,cant,precio;
    //Se creo una lista de tipo Edificio que guardara todos los deatos seteados y getados jaja
    public ArrayList<Edificio> edif = new ArrayList<>();
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

    @Override
    public void setPrecio(int precio) {
       this.precio=precio;
    }


    @Override
    public int getPrecio() {
        return this.precio;
    }
    
}
