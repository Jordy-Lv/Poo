package Clases;

class Auto {

    String marca, modelo;
    int anio;


    public Auto() {
        marca = "Toyota";
        modelo = "Corolla";
        anio = 2024;
    }

    public Auto(String marca){
        this.marca = "Honda";

    }


    void MostrarInfo() {
        System.out.println("Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Año: " + anio);

    }

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Honda");
        auto2.MostrarInfo();
        auto1.MostrarInfo();
    }
}
