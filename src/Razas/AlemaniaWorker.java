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
public class AlemaniaWorker implements Datos {
    private Raza germani;
    private static AlemaniaWorker germaniDos;
    private int vida = 800;
    private int recurso1 = 10000, recurso2 = 5000, recurso3=3000;

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
    public static AlemaniaWorker getInstance(){
        if(germaniDos==null){
            germaniDos = new AlemaniaWorker();
        }
        return germaniDos;
    }
    @Override
    public void crearRaza() {
        germani.setNombreRaza("Alemania");
        germani.setDescripcionRaza("");
    }

    @Override
    public void crearCentroMando() {
        AlemaniaWorker variable = getInstance();
        this.setVida(variable.getVida());
        this.setRecurso1(variable.getRecurso1());
        this.setRecurso2(variable.getRecurso2());
        this.setRecurso3(variable.getRecurso3());
    }

    @Override
    public Raza getRaza() {
        return this.germani;
    }
    public String toString(){
        return "La vida del centro de mando es: "+ String.valueOf(getVida()+" Recurso 1: "+ " Recurso 2: "+ " Recurso 3: ");
    }
}
