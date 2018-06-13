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
    public static PlayerUno getInstance(){
        if(usuario==null){
            usuario=new PlayerUno();
        }
        return usuario;
    }
    public ArrayList<EdificioBase> edificioBase = new ArrayList<>();
    public ArrayList<EdificioEntrenar> edificioEntrenar = new ArrayList<>();
    public ArrayList<EdificioVehiculo> edificioVehiculo = new ArrayList<>();

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
    public void guardarEdificios(int raza,int edificio){
        FactoryAlemania germani = new FactoryAlemania();
        FactoryRusia russian = new FactoryRusia();
        FactoryUSA unaited = new FactoryUSA();
        switch(raza){
            case 1:
                germani.getAlemaniaRaza(edificio).crearEdificacionRecursos();
                EdificioBase recurso = germani.getAlemaniaRaza(edificio).getInstance();
                recurso.edificio.add(recurso);
                usuario.getEdificioBase().add(recurso);
                break;
        }
    }
  
}
