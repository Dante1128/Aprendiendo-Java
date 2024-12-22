package com.aluracursos.screenmach.modelos;

import com.aluracursos.screenmacth.calculos.Clasificacion;

public class Episodio implements Clasificacion {


    private int numero;
    private String nombre;
    private Serie serie;
    private int totalDeVisualizaciones ;

    public int getTotalDeVisualizaciones() {
        return totalDeVisualizaciones;
    }

    public void setTotalDeVisualizaciones(int totalDeVisualizaciones) {
        this.totalDeVisualizaciones = totalDeVisualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public int getClasificacion() {
        if (totalDeVisualizaciones>100){
            return 4;
        }
        else {
            return 2;
        }

    }
}
