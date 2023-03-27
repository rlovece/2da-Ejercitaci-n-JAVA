package com.ruth.clases;

import java.time.Duration;
import java.time.LocalTime;

public class Vuelo {
    private int id;
    private String origen;
    private String destino;
    private LocalTime horarioSaldia;
    private LocalTime horarioLlegada;

    ///region Constructor
    public Vuelo(int id, String origen, String destino, LocalTime horarioSaldia, LocalTime horarioLlegada) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.horarioSaldia = horarioSaldia;
        this.horarioLlegada = horarioLlegada;
    }
    ///endregion

    ///region Getter and Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalTime getHorarioSaldia() {
        return horarioSaldia;
    }

    public void setHorarioSaldia(LocalTime horarioSaldia) {
        this.horarioSaldia = horarioSaldia;
    }

    public LocalTime getHorarioLlegada() {
        return horarioLlegada;
    }

    public void setHorarioLlegada(LocalTime horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }
    ///endregion


    @Override
    public String toString() {
        return "Vuelo " +
                 id +
                " {Origen = '" + origen + '\'' +
                ", Destino = '" + destino + '\'' +
                ", Horario Saldia = " + horarioSaldia +
                ", Horario Llegada = " + horarioLlegada +
                '}';
    }

    public Duration tiempoDeVuelo (LocalTime partida, LocalTime llegada) {
        return Duration.between(partida, llegada);
    }
}
