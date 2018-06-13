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
public interface EdificioRecursoPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setMontoActual( int dineroActual);
    public void setRaza(String raza);
    public void setCapacidad(int capacidad);
    public void setTiempo(int tiempo);
    
    public String getNombre();            
    public int getVida();
    public int getMontoActual();
    public String getRaza();
    public int getCapacidad();
    public int getTiempo();
}
