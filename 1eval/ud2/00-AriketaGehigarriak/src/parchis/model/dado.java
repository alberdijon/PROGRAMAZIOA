package parchis.model;

public class dado {
    
    private int valor;

    public dado(){

        valor = 1;

    }

    public void tirar(){

        System.out.println("Dadoa botatzen...");

        valor = (int)(Math.random()  * 6 + 1);

        System.out.println(valor);

    }

}
