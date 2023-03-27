package com.ruth.clases;
import java.util.Scanner;

public class Contacto {
    int id;
    String nombre;
    String apellido;
    String telefono;
    String correoElectronico;

    ///region Constructor
  /*  public Contacto(int id, String nombre, String apellido, String telefono, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    ///endregion
*/
    ///region Getters and Setters
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    ///endregion

    @Override
    public String toString() {
        return "Contacto " + id +
                ": Nombre: " + nombre + '\'' +
                ", Apellido: " + apellido + '\'' +
                ", Tlefono: " + telefono + '\'' +
                ", Correo Electrónico: " + correoElectronico;
    }

}
