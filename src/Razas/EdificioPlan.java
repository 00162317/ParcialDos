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
public interface EdificioPlan {
    //Sets
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setCapacidad(int capacidad);
    public void setCantidad(int cantidad);
    public void setCantxTurno(int cant);
    //Gets
    public String getNombre();
    public int getVida();
    public int getCapacidad();
    public int getCantidad();
    public int getCantxTurno();
}