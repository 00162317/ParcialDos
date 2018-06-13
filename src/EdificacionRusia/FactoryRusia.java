/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdificacionRusia;

import Razas.*;

/**
 *
 * @author Roberto
 */
public class FactoryRusia implements AbstractFactoryRaza{

    @Override
    public UsaRaza getUsaRaza(int opcion) {
        return null;
    }

    @Override
    public RusiaRaza getRusiaRaza(int opcion) {
          /*
    1.Elbrus
    2.Kiji
    3.Kremlin
    4.Plaza Roja
    5.San Bisilo
    6.Tetriakov
    7.Volgogrado
    */
          switch(opcion){
              case 1:
                  return new ElbrusRecursoTres();
              case 2:
                  return new KijiRecursoUno();
              case 3:
                  return new KremlinMilicia();
              case 4:
                  return new PlazaRojaVehiculoUno();
              case 5:
                  return new SanBisiloVehiculoDos();
              case 6:
                  return new TetriakovRecursoDos();
              case 7:
                 return new VolgogradoCentroMando();
          }
        return null;
    }

    @Override
    public AlemaniaRaza getAlemaniaRaza(int opcion) {
        return null;
    }
    
}