package Clases;

class Metods_Parametros {


    int sumar(int a, int b){

        return a + b;

    }
    int restar(int a, int b){

        return a - b;

    }
    int multiplicacion(int a, int b, int c){

        return a * b * c;

    }

    double division(int a, int b){

        if (b!=0){

            return a/b;

        }else {
            System.out.println("No se puede divir por cero");
        }
        return 0;
    }


    double potencia(double base, double exponente){

        return Math.pow(base, exponente);

    }



    public static void main(String[] args) {

        Metods_Parametros operacion = new Metods_Parametros();
        System.out.println("Suma: " + operacion.sumar(2, 2));
        System.out.println("Resta: " + operacion.restar(2, 2));
        System.out.println("Multiplicacion: " + operacion.multiplicacion(2, 2, 4));
        System.out.println("Division: " + operacion.division(2, 0));
        System.out.println("Potencia: " + operacion.potencia(2, 3));

    }
}
