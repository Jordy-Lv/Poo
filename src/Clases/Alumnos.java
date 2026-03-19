package Clases;

class Alumnos {


    String nombre, asignatura;
    int nota;


    //Metodo Constructor (Debe tener el mismo nombre de la clase)

    public Alumnos(){

        nombre = "Miguel";
        asignatura = "Matematicas";
        nota = 80;

    }

    String CambiaDatos(int nuevaNota){

        this.nota = nuevaNota;


        return "Nueva nota: " + nota;
    }
void DimeDatos(){
        System.out.println("Nombre: " + nombre + "\n" +
                        "Asignatura: " + asignatura + "\n" +
                        "Nota: " + nota);

}


    public static void main(String[] args) {

        Alumnos persona1 = new Alumnos( );

        System.out.println(persona1);
        persona1.DimeDatos();
        persona1.CambiaDatos(40);
        persona1.DimeDatos();

    }


}
