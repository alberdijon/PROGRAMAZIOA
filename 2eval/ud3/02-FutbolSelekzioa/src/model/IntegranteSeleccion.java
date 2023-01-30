package model;

public class IntegranteSeleccion{

    protected int id;
    protected String nombre;
    private String apellidos;
    private int edad;

    public IntegranteSeleccion(int i, String nombre, String string2, int edad) {
        this.id = i;
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = string2;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void concentrarse(){

        System.out.println("El jugador esta en una concentración");

    }

    public void viajar(){

        System.out.println("Está de viaje");

    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad;
    }

}