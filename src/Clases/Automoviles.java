package Clases;
//Creacion de una clase
public class Automoviles {

    //Crear de atributos para una clase
    String marca = "Honda";
    String modelo = "CRV";
    int anio = 2024;
    int cant_ruedas = 4;
    boolean camara = true;


    public static void main(String[] args){

    //Instanciar una clase - crear un objeto a partir de un molde (Clase)
        Automoviles auto1 = new Automoviles();

        //Consultar atributos/valores de los objetos
        System.out.println("Marca:  " + auto1.marca);
        System.out.println("Modelo: " + auto1.modelo);
        System.out.println("Año: " + auto1.anio);
        System.out.println("Cantidad de ruedas: " + auto1.cant_ruedas);
        System.out.println("Tiene camara: " +auto1.camara);
    }



}
