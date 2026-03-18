package Clases;

public class Automoviles {


    String marca = "Honda";
    String modelo = "CRV";
    int anio = 2024;
    int cant_ruedas = 4;
    boolean camara = true;


    public static void main(String[] args){

    //Instanciar una clase - crear un objeto a partir de un molde (Clase)
        Automoviles auto1 = new Automoviles();
        System.out.println("Marca:  " + auto1.marca);
        System.out.println("Modelo: " + auto1.modelo);
        System.out.println("Año: " + auto1.anio);
        System.out.println("Cantidad de ruedas: " + auto1.cant_ruedas);
        System.out.println("Tiene camara: " +auto1.camara);


        System.out.println(auto1);
    }



}
