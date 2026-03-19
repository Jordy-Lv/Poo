package Clases;

public class Numero {


    //Atributo
    private int valor;


    //Setter
    public void setValor(int valor) {

        this.valor = valor;

    }

    //Getter
    public int getValor() {

        return valor;
    }

    //Getter boolean
    public boolean esPar() {

        return valor % 2 == 0;
    }

    public static void main(String[] args) {

        Numero n = new Numero();

        n.setValor(4);
        System.out.println(n.esPar());


    }

}
