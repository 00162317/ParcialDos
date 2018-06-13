/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;
import Jugador.*;
import java.util.Scanner;
/**
 *
 * @author Roberto
 */
public class MenuPrincipal {
    PlayerUno userUno = PlayerUno.getInstance();
    PlayerTwo userDos = PlayerTwo.getInstance();
    Scanner input = new Scanner(System.in);
    public void MenuUno(){
        int opcion = 0;
        
        System.out.println("--------------------------------------");
        System.out.println("------ ROBERTO HERNANDEZ WORLD -------");
        System.out.println("--------------------------------------");
        System.out.println("1. Iniciar juego");
        System.out.println("2. Salir");
        opcion=input.nextInt();
        /*switch(opcion){
            case 1:
                MenuDos();
            case 2:
                
        }
       */
        
    }
    public void MenuDos(){
        int raza;
        System.out.println("-----------Jugador A--------------------");
        System.out.println("Escoga una raza: ");
        System.out.println("1. Raza USA");
        System.out.println("2. Raza Alemania");
        System.out.println("3. Raza Rusia");
        System.out.println("--------------------------------------");
        raza=input.nextInt();
        userUno.setRaza(raza);
        userUno.guardarCentroMando(raza);
        System.out.println(userUno.getRaza());
        System.out.println("-----------Jugador B--------------------");
        System.out.println("Escoga una raza: ");
        System.out.println("1. Raza USA");
        System.out.println("2. Raza Alemania");
        System.out.println("3. Raza Rusia");
        System.out.println("--------------------------------------");
        raza=input.nextInt();
        userDos.setRaza(raza);
        userDos.guardarCentroMando(raza);   
        
    }
    public void MenuTresJugadorUno(){
        int opcion = 0;
        while(opcion!=4){
            System.out.println("----------Jugador A---------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Entrar edificaciones");
            System.out.println("2. Atacar");
            System.out.println("3. Defender");
            System.out.println("4. Acabar turno");
            opcion=input.nextInt();
            
            switch(opcion){
                case 1:
                    MenuCuatroJugadorUno();
                    break;
                case 2:
                case 3:
                case 4: 
                    MenuTresJugadorDos();
                    break;
            }
            
        }
    }
    public void MenuTresJugadorDos(){
        int opcion = 0;
        while(opcion!=4){
        System.out.println("-------------Jugador B-----------------");
        System.out.println("¿Que desea hacer?");
        System.out.println("1. Entrar edificaciones");
        System.out.println("2. Atacar");
        System.out.println("3. Defender");
        System.out.println("4. Acabar turno");
        opcion = input.nextInt();
        switch(opcion){
            case 1:
                MenuCuatroJugadorDos();
            case 2:
            case 3:
            case 4:
                MenuTresJugadorUno();
        }
        }
    }
    public void MenuCuatroJugadorUno(){
        int opcion = 0;
        while(opcion!=7){
        System.out.println("----------Jugador A---------------------");
        System.out.println("Menu Edificaciones");
        System.out.println("1. Crear recurso uno");
        System.out.println("2. Crear recurso dos");
        System.out.println("3. Crear recurso tres");
        System.out.println("4. Crear Milicia");
        System.out.println("5. Crear vehiculo uno");
        System.out.println("6. Crear vehiculo dos");
        System.out.println("7. Regresar");
        opcion=input.nextInt();
        switch(opcion){
            case 1:
                userDos.guardarEdificios(opcion);
                break;
            case 2:
                userDos.guardarEdificios(opcion);
                break;
            case 3:
                userDos.guardarEdificios(opcion);
                break;
            case 4:
                userDos.guardarMilicia(opcion);
                break;
            case 5:
                userDos.guardarVehiculos(opcion);
                break;
            case 6: 
                userDos.guardarVehiculos(opcion);
                break;
            case 7:
                MenuTresJugadorUno();
                break;
        }
        }
    }
    
    public void MenuCuatroJugadorDos(){
        int opcion = 0;
        while(opcion!=7){
        System.out.println("-----------------Jugador B---------------");
        System.out.println("Menu Edificaciones");
        System.out.println("1. Crear recurso uno");
        System.out.println("2. Crear recurso dos");
        System.out.println("3. Crear recurso tres");
        System.out.println("4. Crear Milicia");
        System.out.println("5. Crear vehiculo uno");
        System.out.println("6. Crear vehiculo dos");
        System.out.println("7. Regresar");
        opcion=input.nextInt();
        switch(opcion){
            case 1:
                userUno.guardarEdificios(opcion);
                break;
            case 2:
                userUno.guardarEdificios(opcion);
                break;
            case 3:
                userUno.guardarEdificios(opcion);
                break;
            case 4:
                userUno.guardarMilicia(opcion);
                break;
            case 5:
                userUno.guardarVehiculos(opcion);
                break;
            case 6:
                userUno.guardarVehiculos(opcion);
            case 7:
                MenuTresJugadorUno();
        }
        }
    }
}
