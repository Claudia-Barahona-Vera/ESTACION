package personal;

/*
Clase mecanicos en paquete personal
 */

public class Mecánicos {
    String nombre;
    int tel;
    Especialidad especialidad;
    public enum Especialidad {
        frenos, hidraulica, electricidad, motor
    };
    
    //Constructor
    public Mecánicos(String nombre, int tel, Especialidad especialidad) {
        this.nombre = nombre;
        this.tel = tel;
        this.especialidad = especialidad;
    }//Fin constructor
    
    public void muestraMec(){
        System.out.println("Datos del mecánico");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + tel);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("*****************************************");
    }
    
    //Métodos override
    @Override
    public String toString() {
        return nombre + ", especialidad: " + especialidad;
    }
}//Fin mecanicos
