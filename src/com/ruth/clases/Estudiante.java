package com.ruth.clases;

import java.util.Arrays;

public class Estudiante {

    private int legajo;
    private String nombre;
    private Materia[] materiasAprobadas = new Materia[20];

    ///region Getter and Setter
    public int getLegajo(int i) {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia[] getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Materia[] materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    ///endregion


    @Override
    public String toString() {
        return "Estudiante{" +
                "legajo=" + legajo +
                ", nombre='" + nombre + '\'' +
                ", materiasAprobadas=" + Arrays.toString(materiasAprobadas) +
                '}';
    }
}
