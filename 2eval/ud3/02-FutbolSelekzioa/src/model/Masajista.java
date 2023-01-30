package model;

public class Masajista extends IntegranteSeleccion {

    public Masajista(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        //TODO Auto-generated constructor stub
    }

    private String titulacion;
    private int aniosExperiencia;
    
    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, int edad, String apellidos) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
  }


    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void entrenar(){

        System.out.println("Está entrenando");

    }
    
    public void jugarPartido(){

        System.out.println("Está jugando un partido");

    }


    @Override
    public String toString() {
        return "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
    }
}
