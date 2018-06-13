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
public class EdificioBase/*Edififacion para recursos*/ implements EdificioRecursoPlan {
    public String nombre, raza;
    public int capacidad, vida, dineroActual, tiempo;
    public ArrayList<EdificioBase> edificio = new ArrayList<>();
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void setVida(int vida) {
        this.raza=raza;
    }

    @Override
    public void setMontoActual(int dineroActual) {
        this.dineroActual=dineroActual;
    }

    @Override
    public void setRaza(String raza) {
        this.raza=raza;
    }

    @Override
    public void setCapacidad(int capacidad) {
        this.capacidad=capacidad;
    }

    @Override
    public void setTiempo(int tiempo) {
        this.tiempo=tiempo;
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
    public int getMontoActual() {
        return this.dineroActual;
    }

    @Override
    public String getRaza() {
        return this.raza;
    }

    @Override
    public int getCapacidad() {
        return this.capacidad;
    }

    @Override
    public int getTiempo() {
        return this.tiempo;
    }
    
}
