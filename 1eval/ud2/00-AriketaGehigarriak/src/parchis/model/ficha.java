package parchis.model;

public class ficha {
    
    private String color;
    private int posicion;

    public ficha(String col, int pos){

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

        int pos;

        if ( posicion + gehitu > 68){

            pos = posicion + gehitu - 100;

            setPosicion(pos);

        }else{

            pos = posicion + gehitu;

            setPosicion(pos);

        }

    }

    

}
