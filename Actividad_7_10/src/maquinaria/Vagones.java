package maquinaria;

/*
Clase vagones en paquete maquinaria
 */

class Vagones {
    int numeroI;
    int cargaMax;
    int cargaActual;
    String tipoMercancia;
    
    //Constructor
    public Vagones(int numeroI, int cargaMax, int cargaActual, String tipoMercancia){
        this.numeroI = numeroI;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }//Fin constructor
    
    public void muestraVagon(){
        System.out.println("Datos del vagón");
        System.out.println("Numero identificativo: " + numeroI);
        System.out.println("Carga máxima: " + cargaMax);
        System.out.println("Carga actual: " + cargaActual);
        System.out.println("Tipo de mercancia: " + tipoMercancia);
        System.out.println("*****************************************");
    }
    
    //Métodos override
    @Override
    public String toString() {
        return "carga máxima: " + cargaMax + ", carga actual: " + cargaActual + ", mercancia: " + tipoMercancia;
    }
}//Fin vagones
