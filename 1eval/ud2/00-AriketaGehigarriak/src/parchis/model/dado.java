package parchis.model;

public class Dado {
    
    private int valor;

    public Dado(){

        valor = 1;

    }

    public int getValor(){

        return valor;

    }

    public void tirar(){

        System.out.println("Dadoa botatzen...");

        valor = (int)(Math.random()  * 6 + 1);

        System.out.println(valor);

    }

}
