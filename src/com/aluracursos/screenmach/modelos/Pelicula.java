package com.aluracursos.screenmach.modelos;

import com.aluracursos.screenmacth.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

   private String director;



    public Pelicula(String nombre, int fecheDeLanzamiento) {
        super(nombre, fecheDeLanzamiento);
    }


    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula :" + this.getNombre() + "(" + getFecheDeLanzamiento() + ")" ;
    }
}


