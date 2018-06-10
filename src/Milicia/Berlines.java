/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class Berlines implements MiliciaPlan {
    private String nombre;
    private int dinero,dineroDos,ataque,vida;
     public ArrayList<Berlines> lista = new ArrayList<>();
    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
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
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public String getNombre() {
        return this.nombre;
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
    public int getVida() {
        return this.vida;
    }
    
}
