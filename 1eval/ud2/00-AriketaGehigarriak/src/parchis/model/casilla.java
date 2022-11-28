package parchis.model;

public class Casilla {
    
    private String color;
    private int zenbakia;
    

    public Casilla( String col, int zenb){

        color = col;
        zenbakia = zenb;

    }

    public String getColor(){

        return color;

    }

    public int getZenbakia(){

        return zenbakia;

    }

    public void setZenbakia(int zenb){

        zenbakia = zenb;

    }

    public void setMota( String col){

        color = col;

    }

    


}
