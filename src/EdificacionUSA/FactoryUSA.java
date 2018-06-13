/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionUSA;
import Razas.*;

/**
 *
 * @author Roberto
 */
public class FactoryUSA implements AbstractFactoryRaza{

    @Override
    public UsaRaza getUsaRaza(int opcion) {
         /*
    1.DisneyLand
    2.Casa Blanca
    3.EmpireState
    4.Estatua Libertad
    5.Golden State
    6.Gran Canion
    7.Torres Gemelas
    */
         switch(opcion){
             case 1:
                 return new DisneyLandRecursoTres();
             case 2:
                  return new CasaBlancaVehiculoDos();
             case 3:
                  return new EmpireStateMilicia();
             case 4:
                  return new EstatuaLibertadVehiculoUno();
             case 5:
                  return new GoldenStateRecursoUno();
             case 6:
                  return new GranCanionRecursoDos();
             case 7:
                  return new TorresGemelasCentroMando();
         }
        return null;
    }

    @Override
    public RusiaRaza getRusiaRaza(int opcion) {
        return null;
    }

    @Override
    public AlemaniaRaza getAlemaniaRaza(int opcion) {
        return null;
    }
    
}
