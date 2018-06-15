/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import java.util.ArrayList;

/**
 *
 * @author Roberto
 */

public class VehiculoBase implements VehiculosPlan{
    private String nombre;
    private int vida, dinero,dineroDos,ataque,hacer,llegada,tiempo;
    public ArrayList<VehiculoBase> lista = new ArrayList<>();

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
    
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setPrecio(int dinero, int dineroDos) {
        this.dinero=dinero;
        this.dineroDos=dineroDos;
    }

    @Override
    public void setAtaque(int ataque) {
        this.ataque=ataque;
    }

    @Override
    public void setTiempoHacer(int hacer) {
        this.hacer=hacer;
    }

    @Override
    public void setTiempoLlegada(int llegada) {
        this.llegada=llegada;
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
    public int getPrecio() {
        return this.dinero;
    }

    @Override
    public int getAtaque() {
        return this.ataque;
    }

    @Override
    public int getTiempoHacer() {
        return this.hacer;
    }

    @Override
    public int getTiempoLlegada() {
        return this.llegada;
    }
    
}
