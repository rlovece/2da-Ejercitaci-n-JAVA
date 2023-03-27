package com.ruth.clases;

import java.time.LocalTime;
import java.util.Scanner;

public class Materia {

    private String nombre;
    private int cargaHoraria; /// en hs enteras
    private String profesor;

    ///region Constructores
    public Materia(String nombre, int cargaHoraria, String profesor) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.profesor = profesor;
    }

    public Materia() {

    }
    ///endregion

    ///region Setter and Getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }
    ///endregion

    public Materia cargarMateria (){
        Materia nuevaMateria = new Materia();

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese Nombre: ");
        nuevaMateria.setNombre(scan.next());

        System.out.print("Ingrese carga horaria: ");
        nuevaMateria.setCargaHoraria(scan.nextInt());

        System.out.print("Ingrese Profesor ");
        nuevaMateria.setProfesor(scan.next());

        scan.close();
        return nuevaMateria;
    }

}
