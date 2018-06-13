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
public interface EdificioCentroMandoPlan {
       public void setNombre(String nombre);
    public void setVida(int vida);
    public void setCapacidad1(int capacidad1);
    public void setCapacidad2(int capacidad2);
    public void setCapacidad3(int capacidad3);
    
    public String getNombre();
    public int getVida();
    public int getCapacidad1();
    public int getCapacidad2();
    public int getCapacidad3();
}
