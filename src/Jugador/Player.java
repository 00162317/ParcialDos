/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;

import EdificacionAlemania.FactoryAlemania;
import EdificacionRusia.FactoryRusia;
import EdificacionUSA.FactoryUSA;
import Milicia.FactoryAlemaniaMilicia;
import Milicia.FactoryRusiaMilicia;
import Milicia.FactoryUsaMilicia;
import Milicia.MiliciaBase;
import Razas.EdificioBase;
import Razas.EdificioCentroMando;
import Razas.EdificioEntrenar;
import Razas.EdificioVehiculo;
import Vehiculos.FactoryAlemaniaVehiculos;
import Vehiculos.FactoryRusiaVehiculos;
import Vehiculos.FactoryUsaVehiculos;
import Vehiculos.VehiculoBase;
import java.util.ArrayList;

/**
 *
 * @author Roberto
 */
public class Player {
    public ArrayList<EdificioBase> edificioBase = new ArrayList<>();
    public ArrayList<EdificioEntrenar> edificioEntrenar = new ArrayList<>();
    public ArrayList<EdificioVehiculo> edificioVehiculo = new ArrayList<>();
    public ArrayList<EdificioCentroMando> edificioCentroMando = new ArrayList<>();
    public ArrayList<MiliciaBase> milicia = new ArrayList<>();
    public ArrayList<VehiculoBase> vehiculos = new ArrayList<>(); 

    public ArrayList<MiliciaBase> getMilicia() {
        return milicia;
    }

    public void setMilicia(ArrayList<MiliciaBase> milicia) {
        this.milicia = milicia;
    }

    public ArrayList<VehiculoBase> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<VehiculoBase> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    private int raza;
    private String nombre;

    public ArrayList<EdificioCentroMando> getEdificioCentroMando() {
        return edificioCentroMando;
    }

    public void setEdificioCentroMando(ArrayList<EdificioCentroMando> edificioCentroMando) {
        this.edificioCentroMando = edificioCentroMando;
    }
    
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

    public int getRaza() {
        return raza;
    }

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void guardarEdificiosRecurso(int edificio, Player jugador){
        FactoryAlemania germani = new FactoryAlemania();
        FactoryRusia russian = new FactoryRusia();
        FactoryUSA unaited = new FactoryUSA();
        switch(jugador.getRaza()){
            case 1:
                unaited.getUsaRaza(edificio).crearEdificacionRecursos();
                EdificioBase recurso2 = unaited.getUsaRaza(edificio).getInstance(); 
                jugador.getEdificioBase().add(recurso2);
                break;
              
            case 2:
                germani.getAlemaniaRaza(edificio).crearEdificacionRecursos();
                EdificioBase recurso = germani.getAlemaniaRaza(edificio).getInstance();
                jugador.getEdificioBase().add(recurso);
                break;
            case 3:
                russian.getRusiaRaza(edificio).crearEdificacionRecursos();
                EdificioBase recurso1 = russian.getRusiaRaza(edificio).getInstance();
                jugador.getEdificioBase().add(recurso1);
                break;
        }
    }
        public void guardarEdificioCentroMando(Player jugador){
            FactoryAlemania germani = new FactoryAlemania();
            FactoryRusia russian = new FactoryRusia();
            FactoryUSA unaited = new FactoryUSA();
            switch(jugador.getRaza()){
                case 1:
                        germani.getAlemaniaRaza(7).crearCentroMando();
                        EdificioCentroMando centroMando = germani.getAlemaniaRaza(7).getInstance2();
                        jugador.getEdificioCentroMando().add(centroMando);
                        break;
                case 2:
                       russian.getRusiaRaza(7).crearCentroMando();
                       EdificioCentroMando centroMando1 = russian.getRusiaRaza(7).getInstance2();
                       jugador.getEdificioCentroMando().add(centroMando1);
                       break;
                case 3:
                    unaited.getUsaRaza(7).crearCentroMando();
                    EdificioCentroMando centroMando2 = unaited.getUsaRaza(7).getInstance2();
                    jugador.getEdificioCentroMando().add(centroMando2);
                    break;
            }
        }
    public void guardarEdificioMilicia(Player jugador){
         FactoryAlemania germani = new FactoryAlemania();
         FactoryRusia russian = new FactoryRusia();
         FactoryUSA unaited = new FactoryUSA();
         switch(jugador.getRaza()){
             case 1:
                 germani.getAlemaniaRaza(2).crearEdificacionEntrenamiento();
                EdificioEntrenar entrenar = germani.getAlemaniaRaza(2).getInstance3();
                jugador.getEdificioEntrenar().add(entrenar);
                break;
             case 2:
                 russian.getRusiaRaza(3).crearEdificacionEntrenamiento();
                EdificioEntrenar entrenar1 = russian.getRusiaRaza(3).getInstance3();
                jugador.getEdificioEntrenar().add(entrenar1);
                break;
             case 3:
                 unaited.getUsaRaza(3).crearEdificacionEntrenamiento();
                EdificioEntrenar entrenar2 = russian.getUsaRaza(3).getInstance3();
                jugador.getEdificioEntrenar().add(entrenar2);
                break;
         }
    }
    public void guardarEdificioVehiculo(int edificio, Player jugador){
         FactoryAlemania germani = new FactoryAlemania();
         FactoryRusia russian = new FactoryRusia();
         FactoryUSA unaited = new FactoryUSA();
         switch(jugador.getRaza()){
             case 1:
                germani.getAlemaniaRaza(edificio).crearEdificacionVehiculo();
                EdificioVehiculo carro = germani.getAlemaniaRaza(edificio).getInstance4();
                jugador.getEdificioVehiculo().add(carro);
                break;
             case 2:
                russian.getRusiaRaza(edificio).crearEdificacionVehiculo();
                EdificioVehiculo carro1 = russian.getRusiaRaza(edificio).getInstance4();
                jugador.getEdificioVehiculo().add(carro1);
                break;
             case 3:
                unaited.getUsaRaza(edificio).crearEdificacionVehiculo();
                EdificioVehiculo carro2 = unaited.getUsaRaza(edificio).getInstance4();
                jugador.getEdificioVehiculo().add(carro2);
                break;
         }
    }
    public void guardarMilicia(int tipo, Player jugador){
         FactoryAlemaniaMilicia germani = new FactoryAlemaniaMilicia();
         FactoryRusiaMilicia russian = new FactoryRusiaMilicia();
         FactoryUsaMilicia unaited = new FactoryUsaMilicia();
         switch(jugador.getRaza()){
             case 1:
                germani.getAlemaniaMilicia(tipo).crearMilicia();
                MiliciaBase milicia = germani.getAlemaniaMilicia(tipo).getInstance2();
                jugador.getMilicia().add(milicia);
                break;
             case 2:
                russian.getRusiaMilicia(tipo).crearMilicia();
                MiliciaBase entrenar1 = russian.getRusiaMilicia(tipo).getInstance2();
                jugador.getMilicia().add(entrenar1);
                break;
             case 3:
                unaited.getUsaMilicia(tipo).crearMilicia();
                MiliciaBase entrenar2 = russian.getUsaMilicia(tipo).getInstance2();
                jugador.getMilicia().add(entrenar2);
                break;
         }
    }
    public void guardarVehiculo(int tipo , Player jugador){
         FactoryAlemaniaVehiculos germani = new FactoryAlemaniaVehiculos();
         FactoryRusiaVehiculos russian = new FactoryRusiaVehiculos();
         FactoryUsaVehiculos unaited = new FactoryUsaVehiculos();
         switch(jugador.getRaza()){
             case 1:
                germani.getAlemaniaVehiculos(tipo).crearVehiculo();
                VehiculoBase carro = germani.getAlemaniaVehiculos(tipo).getInstance2();
                jugador.getVehiculos().add(carro);
                break;
             case 2:
                russian.getRusiaVehiculos(tipo).crearVehiculo();
                VehiculoBase carro1 = russian.getRusiaVehiculos(tipo).getInstance2();
                jugador.getVehiculos().add(carro1);
                break;
             case 3:
                 unaited.getUsaVehiculos(tipo).crearVehiculo();
                 VehiculoBase carro2 = unaited.getUsaVehiculos(tipo).getInstance2();
                 jugador.getVehiculos().add(carro2);
         }
    }
    public void mostrarEdificios(Player jugador){
        if(jugador.getEdificioCentroMando().size()>0){
            System.out.println("------------ CENTRO MANDO -----------");
            System.out.println(jugador.getEdificioCentroMando().get(0).getNombre());
            System.out.println(jugador.getEdificioCentroMando().get(0).getVida());
        if(jugador.getEdificioBase().size()>0){
            System.out.println("------------- RECURSOS --------------");
            for(int i = 0;i<jugador.getEdificioBase().size();i++){
                System.out.println(jugador.getEdificioBase().get(i).getNombre());
                System.out.println(jugador.getEdificioBase().get(i).getVida());
                System.out.println(jugador.getEdificioBase().get(i).getMontoActual());
            }
        }
        if(jugador.getEdificioEntrenar().size()>0){
            System.out.println("-------- ENTRENANDO A LA MILICIA ------");
            for(int i = 0;jugador.getEdificioEntrenar().size()>0;i++){
                System.out.println(jugador.getEdificioEntrenar().get(i).getNombre());
                System.out.println(jugador.getEdificioEntrenar().get(i).getVida());
                System.out.println(jugador.getEdificioEntrenar().get(i).getRaza());
            }
        }
        if(jugador.getEdificioVehiculo().size()>0){
            System.out.println("------------- CREANDO VEHICULOS -------------");
            for(int i = 0;jugador.getEdificioVehiculo().size()>0;i++){
                System.out.println(jugador.getEdificioVehiculo().get(i).getNombre());
                System.out.println(jugador.getEdificioVehiculo().get(i).getVida());
                System.out.println(jugador.getEdificioVehiculo().get(i).getTipo());
            }
        }
        }
        
        }public void mostrarMiliciaVehiculo(Player jugador){
            System.out.println("---------MILICIA ----------");
            for(int j = 0;j<jugador.getMilicia().size();j++){
                System.out.println((j+1)+": "+jugador.getMilicia().get(j).getNombre());
                System.out.println("Vida: "+jugador.getMilicia().get(j).getVida());
                System.out.println("Ataque: "+jugador.getMilicia().get(j).getAtaque());
                
            }
            System.out.println("---------VEHICULOS ----------");
               for(int j = 0;j<jugador.getVehiculos().size();j++){
                    System.out.println((j+1)+": "+jugador.getVehiculos().get(j).getNombre());
                System.out.println("Vida: "+jugador.getVehiculos().get(j).getVida());
                System.out.println("Ataque: "+jugador.getVehiculos().get(j).getAtaque());
               }      
                    }
        public void crearFasesEdificios(Player usuario){
            for(int i = 0;i<usuario.getEdificioBase().size();i++){
                int numero = usuario.getEdificioBase().get(i).getTiempo();
            if(usuario.getEdificioBase().get(i).getTiempo()!=0){
                usuario.getEdificioBase().get(i).setTiempo(numero-1);
              if(usuario.getEdificioBase().get(i).getTiempo()==0){
                  System.out.println("Edificio hecho: "+usuario.getEdificioBase().get(i).getNombre());
              }  
            }
            }
            for(int i = 0;i<usuario.getEdificioEntrenar().size();i++){
                int numero = usuario.getEdificioEntrenar().get(i).getTiempo();
            if(usuario.getEdificioEntrenar().get(i).getTiempo()!=0){
                usuario.getEdificioEntrenar().get(i).setTiempo(numero-1);
              if(usuario.getEdificioEntrenar().get(i).getTiempo()==0){
                  System.out.println("Edificio hecho: "+usuario.getEdificioBase().get(i).getNombre());
              }  
            }
            }
          for(int i = 0;i<usuario.getEdificioVehiculo().size();i++){
                int numero = usuario.getEdificioVehiculo().get(i).getTiempo();
            if(usuario.getEdificioVehiculo().get(i).getTiempo()!=0){
                usuario.getEdificioVehiculo().get(i).setTiempo(numero-1);
              if(usuario.getEdificioVehiculo().get(i).getTiempo()==0){
                  System.out.println("Edificio hecho: "+usuario.getEdificioBase().get(i).getNombre());
              }  
            }
            }
          for(int i = 0;i<usuario.getMilicia().size();i++){
                int numero = usuario.getMilicia().get(i).getTiempo();
            if(usuario.getMilicia().get(i).getTiempo()!=0){
                usuario.getMilicia().get(i).setTiempo(numero-1);
              if(usuario.getMilicia().get(i).getTiempo()==0){
                  System.out.println("Edificio hecho: "+usuario.getEdificioBase().get(i).getNombre());
              }  
            }
            }
           for(int i = 0;i<usuario.getVehiculos().size();i++){
                int numero = usuario.getVehiculos().get(i).getTiempo();
            if(usuario.getVehiculos().get(i).getTiempo()!=0){
                usuario.getVehiculos().get(i).setTiempo(numero-1);
              if(usuario.getVehiculos().get(i).getTiempo()==0){
                  System.out.println("Edificio hecho: "+usuario.getEdificioBase().get(i).getNombre());
              }  
            }
            }
          
        }
}

