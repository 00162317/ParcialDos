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
public interface CocheraPlan {
    //Sets
    public void setNombre(String nombre);
    public void setVidaDefensa(int vidaDefensa);
    public void setCapacidad(int capacidad);
    public void setCantidad(int cantidad);
    public void setCantxTurno(int cant);
    public void setPrecio(int precio);
    //Gets
    public String getNombre();
    public int getVidaDefensa();
    public int getCapacidad();
    public int getCantidad();
    public int getCantxTurno();
    public int getPrecio();
}
