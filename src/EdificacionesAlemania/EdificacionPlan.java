/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesAlemania;

/**
 *
 * @author Roberto
 */
public interface EdificacionPlan {
    public void setNombre(String nombre);
    public void setVida(int vida);//Vida de la edificacion xd
    public void setRecursos(int dinero, int dineroDos);//Si necesitara 2 de oro, o 1 de plata para comprar
    public void setElementos(String elementos);//Ejemplo: Que guardara si milicia, vehiculos...
}