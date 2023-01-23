package model;

import enumak.Demarkazioa;

public class Futbolista extends IntegranteSeleccion{

    public Futbolista(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        //TODO Auto-generated constructor stub
    }

    private int dorsal;
    private Demarkazioa demarcacion;
    
    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, Demarkazioa demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    public int getDorsal() {
        return dorsal;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }
    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void darMAsaje(){

        System.out.println("Está dando un masaje");

    }
    
}
