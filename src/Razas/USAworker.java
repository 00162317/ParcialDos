/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Razas;
import Razas.Datos;
/**
 *
 * @author Roberto
 */
public class USAworker implements Datos {
    private Raza unaited;
    private static USAworker unaitedDos;
    private int vida = 800;
    private int recurso1 = 10000, recurso2 = 5000, recurso3= 3000;

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
    //SINGLETON
    private static USAworker getInstance(){
        if(unaitedDos ==null){
            unaitedDos = new USAworker();
        }
        return unaitedDos;
    }
    
    @Override
    public void crearRaza() {
        unaited.setNombreRaza("USA");
        unaited.setDescripcionRaza("");
    }

    @Override
    public void crearCentroMando() {
        USAworker variable = getInstance();
        this.setVida(variable.getVida());
        this.setRecurso1(variable.getRecurso1());
        this.setRecurso2(variable.getRecurso2());
        this.setRecurso3(variable.getRecurso3());
    }

    @Override
    public Raza getRaza() {
        return this.unaited;
    }
    public String toString(){
        return "La vida del centro de comando es: "+String.valueOf(getVida())+" Recurso 1: "+" Recurso 2: "+ " Recurso 3: ";
    }
    
}
