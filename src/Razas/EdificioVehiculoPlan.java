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
public interface EdificioVehiculoPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);
    public void setRaza(String raza);
    public void setTipo(String tipo);
    public void setValor1(int recurso, int valor1);
    public void setValor2(int recurso, int valor2);
    public void setTiempo(int tiempo);
    
    public String getNombre();
    public int getVida();
    public String getRaza();
    public String getTipo();
    public int[] getValor1();
    public int[] getValor2();
    public int getTiempo();
}
