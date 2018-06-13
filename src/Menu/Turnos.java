/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author Roberto
 */
public class Turnos {
    private static Turnos turno ;
    public static Turnos getInstance(){
        if(turno==null){
            turno=new Turnos();
        }
        return turno;
    }
    public void partida(){
        MenuPrincipal varDos = new MenuPrincipal();
        varDos.MenuTresJugadorUno();
    }
    public void run(){
        MenuPrincipal var = new MenuPrincipal();
        var.MenuUno();
        var.MenuDos();
        partida();
    }
}
