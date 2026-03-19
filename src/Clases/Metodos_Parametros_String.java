package Clases;

public class Metodos_Parametros_String {

    void DameDatos(String nombre, int edad, double estatura){

        System.out.println("Nombre: " + nombre + "\n" +
                            "Edad: " +edad + "\n" +
                             "Estatura: " + estatura);

    }


    public static void main(String[] args) {


        Metodos_Parametros_String persona = new Metodos_Parametros_String();

        persona.DameDatos("Jordy", 25, 1.80);

    }


}
