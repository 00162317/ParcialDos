/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import EdificacionAlemania.FactoryAlemania;
import EdificacionRusia.FactoryRusia;
import EdificacionUSA.FactoryUSA;
import Razas.*;
import java.util.ArrayList;
///import Vehiculos.*;
//import Milicia.*;

/**
 *
 * @author Roberto
 */
public class PlayerUno {
    //Razas.AbstractFactory raza;
    private static PlayerUno usuario = new PlayerUno();
    private int raza;
    FactoryAlemania germani = new FactoryAlemania();
    FactoryRusia russian = new FactoryRusia();
    FactoryUSA unaited = new FactoryUSA();
    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }
    
    public static PlayerUno getInstance(){
        if(usuario==null){
            usuario=new PlayerUno();
        }
        return usuario;
    }
    public ArrayList<EdificioBase> edificioBase = new ArrayList<>();
    public ArrayList<EdificioEntrenar> edificioEntrenar = new ArrayList<>();
    public ArrayList<EdificioVehiculo> edificioVehiculo = new ArrayList<>();

    public ArrayList<EdificioCentroMando> getEdificioCentroMando() {
        return edificioCentroMando;
    }

    public void setEdificioCentroMando(ArrayList<EdificioCentroMando> edificioCentroMando) {
        this.edificioCentroMando = edificioCentroMando;
    }
    public ArrayList<EdificioCentroMando> edificioCentroMando = new ArrayList<>();

    public ArrayList<EdificioBase> getEdificioBase() {
        return edificioBase;
    }

    public void setEdificioBase(ArrayList<EdificioBase> edificioBase) {
        this.edificioBase = edificioBase;
    }

    public ArrayList<EdificioEntrenar> getEdificioEntrenar() {
        return edificioEntrenar;
    }

    public void setEdificioEntrenar(ArrayList<EdificioEntrenar> edificioEntrenar) {
        this.edificioEntrenar = edificioEntrenar;
    }

    public ArrayList<EdificioVehiculo> getEdificioVehiculo() {
        return edificioVehiculo;
    }

    public void setEdificioVehiculo(ArrayList<EdificioVehiculo> edificioVehiculo) {
        this.edificioVehiculo = edificioVehiculo;
    }
   
    public void guardarEdificios(int edificio){
        
        switch(usuario.getRaza()){
            case 1:
                        /*
                    1.Bemberg
                    2.Brenderburgo
                    3.Dresde
                    4.Europa Park
                    5.Hamburgo
                    6.Munich
                    7.Muro Berlin
                    */
                germani.getAlemaniaRaza(edificio).crearEdificacionRecursos();
                EdificioBase recurso = germani.getAlemaniaRaza(edificio).getInstance();
                recurso.edificio.add(recurso);
                usuario.getEdificioBase().add(recurso);
                break;
            case 2:
                    /*
                    1.Elbrus
                    2.Kiji
                    3.Kremlin
                    4.Plaza Roja
                    5.San Bisilo
                    6.Tetriakov
                    7.Volgogrado
                    */
                russian.getRusiaRaza(edificio).crearEdificacionRecursos();
                EdificioBase recurso1 = russian.getRusiaRaza(edificio).getInstance();
                //recurso1.edificio.add(recurso1);
                usuario.getEdificioBase().add(recurso1);
            case 3:
                    /*
                    1.DisneyLand
                    2.Casa Blanca
                    3.EmpireState
                    4.Estatua Libertad
                    5.Golden State
                    6.Gran Canion
                    7.Torres Gemelas
                    */
                unaited.getUsaRaza(edificio).crearEdificacionRecursos();
                EdificioBase recurso2 = unaited.getUsaRaza(edificio).getInstance();
                //recurso2.edificio.add(recurso2);
                usuario.getEdificioBase().add(recurso2);
        }
    }
    public void guardarVehiculos(int edificio){
       
        switch(usuario.getRaza()){
            case 1:
                germani.getAlemaniaRaza(edificio).crearEdificacionVehiculo();
                EdificioVehiculo carro = germani.getAlemaniaRaza(edificio).getInstance4();
                //carro.edificioCarros.add(carro);
                usuario.getEdificioVehiculo().add(carro);
            case 2:
                russian.getRusiaRaza(edificio).crearEdificacionVehiculo();
                EdificioVehiculo carro1 = russian.getRusiaRaza(edificio).getInstance4();
                //carro1.edificioCarros.add(carro1);
                usuario.getEdificioVehiculo().add(carro1);
            case 3:
                unaited.getUsaRaza(edificio).crearEdificacionVehiculo();
                EdificioVehiculo carro2 = unaited.getUsaRaza(edificio).getInstance4();
                //carro2.edificioCarros.add(carro2);
                usuario.getEdificioVehiculo().add(carro2);
        }
    }
    public void guardarMilicia(int edificio){
        switch(usuario.getRaza()){
            case 1:
                germani.getAlemaniaRaza(edificio).crearEdificacionEntrenamiento();
                EdificioEntrenar entrenar = germani.getAlemaniaRaza(edificio).getInstance3();
                //entrenar.edificioEntrenamiento.add(entrenar);
                usuario.getEdificioEntrenar().add(entrenar);
            case 2:
                russian.getRusiaRaza(edificio).crearEdificacionEntrenamiento();
                EdificioEntrenar entrenar1 = russian.getRusiaRaza(edificio).getInstance3();
                //entrenar1.edificioEntrenamiento.add(entrenar1);
                usuario.getEdificioEntrenar().add(entrenar1);
            case 3:
                unaited.getUsaRaza(edificio).crearEdificacionEntrenamiento();
                EdificioEntrenar entrenar2 = russian.getUsaRaza(edificio).getInstance3();
                //entrenar2.edificioEntrenamiento.add(entrenar2);
                usuario.getEdificioEntrenar().add(entrenar2);
        }
        
    }
    public void guardarCentroMando(int edificio){
        switch(usuario.getRaza()){
            case 1:
                germani.getAlemaniaRaza(edificio).crearCentroMando();
                EdificioCentroMando centroMando = germani.getAlemaniaRaza(edificio).getInstance2();
                //centroMando.edificioCentroMando.add(centroMando);
                usuario.getEdificioCentroMando().add(centroMando);
            case 2:
                russian.getRusiaRaza(edificio).crearCentroMando();
                EdificioCentroMando centroMando1 = russian.getRusiaRaza(edificio).getInstance2();
                //centroMando1.edificioCentroMando.add(centroMando1);
                usuario.getEdificioCentroMando().add(centroMando1);
            case 3:
                unaited.getUsaRaza(edificio).crearCentroMando();
                EdificioCentroMando centroMando2 = unaited.getUsaRaza(edificio).getInstance2();
                //centroMando2.edificioCentroMando.add(centroMando2);
                usuario.getEdificioCentroMando().add(centroMando2);
        }
    }
  
}
