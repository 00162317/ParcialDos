/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Milicia;

/**
 *
 * @author Roberto
 */
public interface MiliciaPlan {
    public void setNombre(String nombre);
    public void setPrecio(int dinero, int dineroDos);
    public void setAtaque(int ataque);
    public void setVida(int vida);
    
    public String getNombre();
    public int getPrecio();
    public int getAtaque();
    public int getVida();
}
