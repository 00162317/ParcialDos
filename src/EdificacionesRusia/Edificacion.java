/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionesRusia;

/**
 *
 * @author Roberto
 */
public class Edificacion implements EdificacionPlan{
    private String nombre, elementos;
    private int vida, dinero, dineroDos;
    @Override
    public void setNombreEdificacion(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public void setVida(int vida) {
        this.vida=vida;
    }

    @Override
    public void setRecursos(int dinero, int dineroDos) {
        this.dinero=dinero;
        this.dineroDos=dineroDos;
    }

    @Override
    public void setElementos(String elementos) {
            this.elementos=elementos;
    }
    
}
