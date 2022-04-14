package Entidades;

import java.util.ArrayList;



public class Cliente {
    
    private int dni;
    
    private String nombre;
    
    private String apellido;
    
    private Cuenta cuenta;
    
    private ArrayList<Prestamo> prestamo;

    public Cliente() {
    }

    public Cliente(int dni, String nombre, String apellido, Cuenta cuenta, ArrayList<Prestamo> prestamo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.prestamo = prestamo;
    }

  
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList<Prestamo> getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(ArrayList<Prestamo> prestamo) {
        this.prestamo = prestamo;
    }



    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", cuenta=" + cuenta + ", prestamo=" + prestamo + '}';
    }

    
}
