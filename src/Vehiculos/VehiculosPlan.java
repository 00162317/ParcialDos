/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

/**
 *
 * @author Roberto
 */
public interface VehiculosPlan {
    //Sets
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setPrecio(int dinero, int dineroDos);
    public void setAtaque(int ataque);
    public void setTiempoHacer(int hacer);
    public void setTiempoLlegada(int llegada);
    //Gets
    public String getNombre();
    public int getVida();
    public int getPrecio();
    public int getAtaque();
    public int getTiempoHacer();
    public int getTiempoLlegada();
}
