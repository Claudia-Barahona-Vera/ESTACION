package maquinaria;

/*
Clase locomotoras en paquete maquinaria
 */

import personal.Mecánicos;

public class Locomotoras {
    String matricula;
    int potencia;
    int año_fab;
    
    //Mecánico asigando a cada locomotora
    Mecánicos mec;
    
    //Constructor
    public Locomotoras(String matricula, int potencia, int año_fab, Mecánicos mec){
        this.matricula = matricula;
        this.potencia = potencia;
        this.año_fab = año_fab;
        this.mec = mec;
    }//Fin constructor
    
    public void muestraLocomotora(){
        System.out.println("Datos de la locomotora");
        System.out.println("Matricula: " + matricula);
        System.out.println("Potencia: " + potencia);
        System.out.println("Año de fabricación: " + año_fab);
        System.out.println("Mecánico asignado: " + mec.toString());
        System.out.println("*****************************************");
    }
}//Fin locomotoras
