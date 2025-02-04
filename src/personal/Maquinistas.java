package personal;

/*
Clase maquinistas en paquete personal
 */

public class Maquinistas {
    String nombre;
    String dni;
    double sueldo;
    String rango;
    
    //Constructor
    public Maquinistas (String nombre, String dni, double sueldo, String rango){
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
    }//Fin constructor
    
    public void muestraMaq(){
        System.out.println("Datos del maquinista");
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Sueldo: " + sueldo);
        System.out.println("Rango: " + rango);
        System.out.println("*****************************************");
    }
    
    //Métodos override
    @Override
    public String toString() {
        return nombre + ", rango: " + rango;
    }
}//Fin maquinistas
