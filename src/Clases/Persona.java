package Clases;

class Persona {

    String nombre = "Jose";
    int edad = 30;
    double peso = 86.30;
    boolean soltero = true;



    //Metodo GET
    String DimeNombre(){

        return nombre + " esta aprendiendo Java";

    }


    //Metodo SET
    void DimePeso(){

        if (peso > 70 && edad > 30){

            System.out.println(nombre + " debe hacer ejercicio");
        }else {

            System.out.println(nombre + " estas en tu peso correcto");

        }
        if (soltero){

            System.out.println("Necesita una novia");

        }else{

            System.out.println("Cuida a tu pareja");

        }


    }



    int DimeEdad (){

        return edad;
    }


    public static void main(String[] args) {

    Persona persona1 = new Persona();
        System.out.println("Nombre: " + persona1.nombre);
        System.out.println(persona1.DimeNombre() + "\nSu edad es: " + persona1.DimeEdad());
        persona1.DimePeso();

    }


}
