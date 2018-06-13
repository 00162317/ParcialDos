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
public class EdificioVehiculo implements EdificioVehiculoPlan{
   public String nombre, raza, tipoVehiculo;
    public int costo1, costo2, recurso1, recurso2, vida, tiempo;
    
    public ArrayList<EdificioVehiculo> edificioCarros = new ArrayList<>();
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setRaza(String raza) {
        this.raza=raza;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipoVehiculo=tipo;
    }

    @Override
    public void setValor1(int recurso, int valor1) {
        this.recurso1=recurso;
        this.costo1=valor1;
    }

    @Override
    public void setValor2(int recurso, int valor2) {
        this.recurso2=recurso;
        this.costo2=valor2;
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
    public String getRaza() {
        return this.raza;
    }

    @Override
    public String getTipo() {
        return this.tipoVehiculo;
    }

    @Override
    public int[] getValor1() {
     int[] costo = new int[1];
        costo[0] = this.recurso1;
        costo[1] = this.costo1;
        return costo;
    }

    @Override
    public int[] getValor2() {
         int[] costo = new int[1];
        costo[0] = this.recurso2;
        costo[1] = this.costo2;
        return costo;
     
    }

    @Override
    public int getTiempo() {
        return this.tiempo;
    }
    
}
