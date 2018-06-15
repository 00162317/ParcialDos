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
public class MenuRoberto {
    public static Player usuarioUno = new Player(); 
    public static Player usuarioDos = new Player();
    public void turnos(){
        MenuRoberto menusito = new MenuRoberto();
        menusito.MenuBase(usuarioUno);
    }
    public void Menu(){
        int opcion = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("------ ROBERTO HERNANDEZ WORLD -------");
        System.out.println("--------------------------------------");
        System.out.println("1. Iniciar juego");
        System.out.print("Respuesta: ");
        opcion=input.nextInt();
        switch(opcion){
            case 1:
                MenuRaza(usuarioUno);
                break;
        }
        
    }
    public void MenuRaza(Player user){
        //Player userDos = new Player();
        int raza;
        Scanner input = new Scanner(System.in);
        System.out.println("-----------Jugador A--------------------");
        System.out.println("Escoga una raza: ");
        System.out.println("1. Raza USA");
        System.out.println("2. Raza Alemania");
        System.out.println("3. Raza Rusia");
        System.out.println("--------------------------------------");
        System.out.print("Respuesta: ");
        raza=input.nextInt();
        usuarioUno.setRaza(raza);
        usuarioUno.guardarEdificioCentroMando(user);
        System.out.println("-----------Jugador B--------------------");
        System.out.println("Escoga una raza: ");
        System.out.println("1. Raza USA");
        System.out.println("2. Raza Alemania");
        System.out.println("3. Raza Rusia");
        System.out.println("--------------------------------------");
        System.out.print("Respuesta: ");
        raza=input.nextInt();
        usuarioDos.setRaza(raza);
        usuarioDos.guardarEdificioCentroMando(user);
          
    }
    public int contador = 1;
    public void MenuBase(Player user){
         int opcion = 0;
        Player userDos = new Player();
        Scanner input = new Scanner(System.in);
        while(opcion!=5){
            System.out.println("-----------------------------");
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Entrar edificaciones");
            System.out.println("2. Atacar");
            System.out.println("3. Defender");
            System.out.println("4. Acabar turno");
            System.out.println("5. Mostrar las edificaciones");
            System.out.print("Respuesta: ");
            opcion=input.nextInt();
            
            switch(opcion){
                case 1:
                    MenuEdificaciones(usuarioUno);
                    MenuEdificaciones(usuarioDos);
                    break;
                case 2:
                case 3:
                case 4: 
                    if(usuarioUno==userDos){
                        MenuBase(usuarioUno);
                    }
                    else{
                        contador++;
                        userDos.crearFasesEdificios(usuarioUno);
                        userDos.crearFasesEdificios(usuarioDos);
                        MenuBase(usuarioDos);
                    }
                    break;
                case 5:
                    userDos.mostrarEdificios(usuarioUno);
                    userDos.mostrarEdificios(usuarioDos);
                    break;
            }
            
        }
    }
    public void MenuEdificaciones(Player user){
        int opcion = 0;
        Player userDos = new Player();
        Scanner input = new Scanner(System.in);
        while(opcion!=7){
        System.out.println("----------Creando---------------------");
        System.out.println("1. Crear recurso uno");
        System.out.println("2. Crear recurso dos");
        System.out.println("3. Crear recurso tres");
        System.out.println("4. Crear Milicia");
        System.out.println("5. Crear vehiculo uno");
        System.out.println("6. Crear vehiculo dos");
        System.out.println("7. Regresar");
        System.out.print("Respuesta: ");
        opcion=input.nextInt();
        switch(opcion){
            case 1:
                userDos.guardarEdificiosRecurso(opcion, user);
                break;
            case 2:
                userDos.guardarEdificiosRecurso(opcion, user);
                break;
            case 3:
                userDos.guardarEdificiosRecurso(opcion, user);
                break;
            case 4:
                userDos.guardarEdificioMilicia(user);
                break;
            case 5:
                userDos.guardarEdificioVehiculo(opcion, user);
                break;
            case 6: 
                userDos.guardarEdificioVehiculo(opcion, user);
                break;
            case 7:
                MenuBase(user);
                break;
        }
        
        }
    }
    public void menuMilicia(Player user){
        int opcionDos;
        Player hola = new Player();
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cual desea modificar?");
        System.out.println("1: Escuadron");
        System.out.println("2: Especialista");
        System.out.println("Ingrese opcion: ");
        opcionDos=input.nextInt();
        hola.guardarMilicia(opcionDos, user);
    }
    public void partida(){
        MenuRoberto menusito = new MenuRoberto();
        menusito.MenuBase(usuarioUno);
    }
}
