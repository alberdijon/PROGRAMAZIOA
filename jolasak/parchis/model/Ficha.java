package parchis.model;

public class Ficha {
    
    private String color;
    private int posicion;

    public Ficha(String col, int pos){

        color = col;
        posicion = pos;

    }

    public int getPosizioa(){
    
        return posicion;
    
    }

    public String getKolorea(){
    
        return color;
    
    }

    public void setPosicion(int pos){

        posicion = pos;

    }

    public void setColor(String col){

        color = col;

    }

    public void aurreratu(int gehitu){

        int pos = posicion + gehitu ;

            setPosicion(pos);



    }

    

}
