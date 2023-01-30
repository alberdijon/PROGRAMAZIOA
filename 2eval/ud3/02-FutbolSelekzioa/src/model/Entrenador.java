package model;

public class Entrenador extends IntegranteSeleccion{

    public Entrenador(int edad, String nombre, int i, String string2) {
        super(i, nombre, string2, edad);
        //TODO Auto-generated constructor stub
    }

    private String idFederacion;
    
    public Entrenador(String idFederacion, int id, String nombre, int edad, String apellidos) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
  }


    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public void dirigirEntrenamiento(){

        System.out.println("Está dirigiendo un entrenamiento");

    }

    public void dirigirPartido(){

        System.out.println("Está dirigiendo un partido");

    }


    @Override
    public String toString() {
        return "Entrenador [ "  + "idFederacion=" + idFederacion + "]";
    }


}
