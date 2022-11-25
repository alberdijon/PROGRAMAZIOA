package parchis.model;

public class casilla {
    
    private String color;
    private int zenbakia;
    

    public casilla( String col, int zenb){

        color = col;
        zenbakia = zenb;

    }

    public String getMota(){

        return color;

    }

    public int getColor(){

        return zenbakia;

    }

    public void setZenbakia(int zenb){

        zenbakia = zenb;

    }

    public void setMota( String col){

        color = col;

    }

    


}
