/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import Interface.*;

/**
 *
 * @author Roberto
 */
public class RusiaWorker implements Datos{
    private Raza russian;
    private static RusiaWorker russianDos; 
    private int vida = 900;
    private int recurso1=10000, recurso2=5000, recurso3=3000;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(int recurso1) {
        this.recurso1 = recurso1;
    }

    public int getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(int recurso2) {
        this.recurso2 = recurso2;
    }

    public int getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(int recurso3) {
        this.recurso3 = recurso3;
    }
    //Usando SINGLETON
    public static RusiaWorker getInstance(){
        if(russianDos==null){
            russianDos=new RusiaWorker();
        }
        return russianDos;
    }
            
    @Override
    public void crearRaza() {
      russian.setNombreRaza("Rusia");
      russian.setDescripcionRaza("");
    }

    @Override
    public void crearCentroMando() {
        RusiaWorker variable = getInstance();
        this.setVida(variable.getVida());
        this.setRecurso1(variable.getRecurso1());
        this.setRecurso2(variable.getRecurso2());
        this.setRecurso3(variable.getRecurso3());
    }

    @Override
    public Raza getRaza() {
        return this.russian;
    }
    public String toString(){
        return "La vida del centro de comando es: "+String.valueOf(getVida())+"Recurso 1: "+" Recurso 2: "+" Recurso 3: ";
    }
    
}
