package Clases;

public class CalculadoraBasica {



    public boolean esPar (int a){

        if (a % 2 == 0){

            return true;

        }else{


        }return false;
    }


public int sumar(int a, int b){

    return a + b;
}


public int mayor(int a, int b){

    if (a > b){

        return a;


    }else {


        return b;
    }

}

public void saludar(String nombre){

    System.out.println("Hola, soy " + nombre);

}


    public static void main(String[] args) {


    CalculadoraBasica operacion = new CalculadoraBasica();


        System.out.println("Suma: " + operacion.sumar(2, 4));

        System.out.println("El numero mayor es: " + operacion.mayor(4, 2));

        operacion.saludar("Jordy");

        System.out.println("¿Es par? " + "\n" +
                           operacion.esPar(4));;
    }

}
