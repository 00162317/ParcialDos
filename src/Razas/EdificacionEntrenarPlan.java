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
public interface EdificacionEntrenarPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setRaza(String raza);
    public void setCosto1(int recurso, int costo1);
    public void setCosto2(int recurso, int costo2);
    public void setTiempo(int tiempo);
    
    public String getNombre();
    public int getVida();
    public String getRaza();
    public int[] getCosto1();
    public int[] getCosto2();
    public int getTiempo();
}
