package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class EpekakoErosketa extends Erosketa{
    
    public EpekakoErosketa(String kodea, String data, Bezeroak bezeroa, ArrayList<Produktuak> produktuak, ArrayList<Integer> unitateak, double guztira, int i, boolean b, int j) {
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

    public EpekakoErosketa(String kodea, Bezeroak bezeroa, double guztira) {
        super(kodea, bezeroa, guztira);

        this.epeak = 12;
        this.ordainketaBukatua = false;
        this.kuota = guztira / 12;

    }

    public double gainetikOrdainduBeharrekoa(){

        double ordaindubeharrekoa = epeak * kuota;

        return ordaindubeharrekoa;

    }

}
