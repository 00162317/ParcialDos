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

public class EdificioEntrenar implements EdificacionEntrenarPlan{
    public String nombre, raza;
    public int costo1, costo2, recurso1, recurso2, vida, tiempo;
    
    public ArrayList<EdificioEntrenar> edificioEntrenamiento = new ArrayList<>();

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setVida(int vida) {
       this.vida = vida;
    }

    @Override
    public void setRaza(String raza) {
       this.raza = raza;
    }

    @Override
    public void setCosto1(int recurso, int costo1) {
        this.recurso1 = recurso;
        this.costo1 = costo1;
    }

    @Override
    public void setCosto2(int recurso, int costo2) {
        this.recurso2 = recurso;
        this.costo2 = costo2;
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
    public String getRaza() {
        return this.raza;
    }

    @Override
    public int[] getCosto1() {
        int[] costo = new int[1];
        costo[0] = this.recurso1;
        costo[1] = this.costo1;
        return costo;
    }

    @Override
    public int[] getCosto2() {
        int[] costo = new int[1];
        costo[0] = this.recurso2;
        costo[1] = this.costo2;
        return costo;
    }   

    @Override
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public int getTiempo() {
        return this.tiempo;
    }
}

