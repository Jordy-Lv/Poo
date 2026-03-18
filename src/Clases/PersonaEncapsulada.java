package Clases;

public class PersonaEncapsulada {

    private String nombre;
    private int edad;
    private double peso;
    private boolean soltero;

    public PersonaEncapsulada() {
        nombre = "Jose";
        edad = 30;
        peso = 86.30;
        soltero = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isSoltero() {
        return soltero;
    }

    public void setSoltero(boolean soltero) {
        this.soltero = soltero;
    }

    public void mostrarEstadoFisico() {
        if (peso > 70 && edad > 30) {
            System.out.println(nombre + " debe hacer ejercicio");
        } else {
            System.out.println(nombre + " está en su peso correcto");
        }
    }

    public void mostrarEstadoSentimental() {
        if (soltero) {
            System.out.println(nombre + " está soltero");
        } else {
            System.out.println(nombre + " tiene pareja");
        }
    }

    public static void main(String[] args) {

        PersonaEncapsulada persona1 = new PersonaEncapsulada();

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

        persona1.mostrarEstadoFisico();
        persona1.mostrarEstadoSentimental();

        persona1.setNombre("Jordy");
        persona1.setEdad(20);

        System.out.println("Nuevo nombre: " + persona1.getNombre());
        System.out.println("Nueva edad: " + persona1.getEdad());
    }
}