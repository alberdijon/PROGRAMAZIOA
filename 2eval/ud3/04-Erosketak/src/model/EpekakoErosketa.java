package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class EpekakoErosketa extends Erosketa{
    
    public EpekakoErosketa(String kodea, String data, Bezeroak bezeroa, ArrayList<Produktuak> produktuak, ArrayList<Integer> unitateak, double guztira) {
        super(kodea, data, bezeroa, produktuak, unitateak, guztira);
        
    }
    private int epeak;
    private boolean ordainketaBukatua;
    private double kuota;


    public EpekakoErosketa(String kodea, String data, Bezeroak bezeroa, ArrayList<Produktuak> produktuak, ArrayList<Integer> unitateak, double guztira, double kuota){
        super(kodea, data, bezeroa, produktuak, unitateak, guztira);

        this.epeak = 12;
        this.ordainketaBukatua = false;
        this.kuota = kuota;

    }

    public double gainetikOrdainduBeharrekoa(){

        double ordaindubeharrekoa = epeak * kuota;

        return ordaindubeharrekoa;

    }

}
