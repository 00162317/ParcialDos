
package robertohernandezworld;


import Milicia.MiliciaBase;
import java.util.Scanner;
import java.util.ArrayList;

import Vehiculos.VehiculoBase;
import Jugador.*;

/**
 *
 * @author Roberto
 */
public class RobertoHernandezWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*FactoryAlemania alemania = new FactoryAlemania();
        FactoryUSA unaited = new FactoryUSA();
        FactoryRusia russian = new FactoryRusia();
        /////////////////////////////////////////////////
        alemania.getAlemania(1).crearEdificacion();
        unaited.getUsa(2).crearEdificacion();
        russian.getRusia(3).crearEdificacion();
        //////////////////////////////////////////////////
        Edificio edifBase = BembergWorker.getInstance();
        edifBase.edif.add(edifBase);
        Edificio edifUsa = CasaBlancaWorker.getInstance();
        edifBase.edif.add(edifUsa);
        //////////////////////////////////////////////////////
        System.out.println("Edificacion: "+edifBase.edif.get(0).getNombre());
        System.out.println("Edificacion: "+edifBase.edif.get(1).getNombre());
        */
        PlayerUno user = PlayerUno.getInstance();
        user.guardarEdificios(1, 1);
       System.out.println(user.edificioBase.get(0).getNombre());
    }
    
}
