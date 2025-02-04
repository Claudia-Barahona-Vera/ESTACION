package maquinaria;

/*
Clase trenes en paquete maquinaria
 */

import personal.Maquinistas;

public class Trenes {
    Locomotoras locomotora;
    Vagones[] vagones;
    Maquinistas maquinistaResponsable;
    private int numVagones;
    
    //Constructor
    public Trenes(Locomotoras locomotora, Maquinistas maquinistaResponsable){
        this.locomotora = locomotora;
        this.maquinistaResponsable = maquinistaResponsable;
        vagones = new Vagones[5];
        numVagones = 0;
    }//Fin constructor
    
    //Método para añadir vagones al tren
    public void enganchaVagon(int cargaMax, int cargaActual, String tipoMercancia){
        if (numVagones >= 5) {
            System.out.println("El tren no admite más vagones");
        } else {
            Vagones v = new Vagones(numVagones, cargaMax, cargaActual, tipoMercancia);
            vagones[numVagones] = v;
            numVagones++;
        }//Fin if-else
    }//Fin añadir vagones
    
    
    public void muestraTren(){
        System.out.println("Datos del tren");
        System.out.println("Maquinista responsable: " + maquinistaResponsable.toString());
        for (int i = 0; i < numVagones; i++) {
            System.out.println("Vagón " + i + ": " + vagones[i].toString()); 
        }//Fin for
        System.out.println("*****************************************");
    }
}//Fin trenes
