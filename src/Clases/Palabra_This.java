package Clases;

public class Palabra_This {

    String nombre = "Maria";

    String dimeNombre(String nombre){

        this.nombre = nombre;
        return nombre;
    }

    void muestraNombre(){
        System.out.println("Nombre: " + nombre);
    }


    public static void main(String[] args) {

        Palabra_This persona = new Palabra_This();

        persona.dimeNombre("Pedro");
        persona.muestraNombre();

    }


}
