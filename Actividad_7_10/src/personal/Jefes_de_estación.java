package personal;

/*
Clase jefes de estacion en paquete personal
 */

import java.time.LocalDateTime;

public class Jefes_de_estación {
    String nombre;
    String dni;
    LocalDateTime nombramiento;
    
    //Constructor
    public Jefes_de_estación(String nombre, String dni, LocalDateTime nombramiento){
        this.nombre = nombre;
        this.dni = dni;
        this.nombramiento = nombramiento;
    }//Fin constructor
    
    public void muestraJefeEstacion(){
        System.out.println("Datos del jefe de estación:");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Fecha de nombramiento: " + nombramiento);
        System.out.println("*****************************************");
    }
}//Fin jefes de estacion
