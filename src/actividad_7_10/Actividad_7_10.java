package actividad_7_10;

/*
Clase main
 */

import personal.*;
import maquinaria.*;
import java.time.LocalDateTime;

public class Actividad_7_10 {
    public static void main(String[] args) {
        Maquinistas PepeMaq = new Maquinistas("pepe", "54646246V", 1205.50, "Jefe");
        PepeMaq.muestraMaq();
        
        Mecánicos mec2 = new Mecánicos("pepa", 687325410, Mecánicos.Especialidad.motor);
        mec2.muestraMec();
        
        Jefes_de_estación jefe1 = new Jefes_de_estación("lolo", "547862D", LocalDateTime.now());
        jefe1.muestraJefeEstacion();
        
        
        Locomotoras loco1 = new Locomotoras("4578", 450, 2005, mec2);
        loco1.muestraLocomotora();
        
        Trenes tren1 = new Trenes(loco1, PepeMaq);
        tren1.muestraTren();
        
        tren1.enganchaVagon(100, 50, "comida");
        tren1.muestraTren();
        
        tren1.enganchaVagon(41, 10, "cosas");
        tren1.muestraTren();
        
        tren1.enganchaVagon(100, 99, "artefactos");
        tren1.muestraTren();
        
        tren1.enganchaVagon(500, 250, "comida");
        tren1.muestraTren();
        
        tren1.enganchaVagon(12, 7, "ordenadores");
        tren1.muestraTren();
        
        tren1.enganchaVagon(20, 15, "pelotas");
        tren1.muestraTren();
    }//Fin main
}//Fin public class
