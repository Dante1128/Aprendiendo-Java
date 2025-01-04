package com.aluracursos.screenmach.modelos;

import com.aluracursos.screenmach.excepcion.ErrorEnConversionDeDuracionExcepcion;
import com.google.gson.annotations.SerializedName;

public class Titulo  implements Comparable<Titulo>{

    @SerializedName("Title")

    private String nombre ;
    @SerializedName("Year")
    private int fecheDeLanzamiento;
    private int duracionEnMinutos;
    private boolean includeEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fecheDeLanzamiento) {
        this.nombre = nombre;
        this.fecheDeLanzamiento = fecheDeLanzamiento;
    }

    public Titulo(TituloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fecheDeLanzamiento = Integer.valueOf(miTituloOmdb.year()) ;
        if (miTituloOmdb.runtime().contains("N/A") ) {
            throw  new ErrorEnConversionDeDuracionExcepcion("No pude convertir la duracion" +
                    "porue contiene un N/A");
            
        }
        this.duracionEnMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0,3).replace(" ",""));

    }

    public String getNombre() {
        return nombre;
    }

    public int getFecheDeLanzamiento() {
        return fecheDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncludeEnElPlan() {
        return includeEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecheDeLanzamiento(int fecheDeLanzamiento) {
        this.fecheDeLanzamiento = fecheDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncludeEnElPlan(boolean includeEnElPlan) {
        this.includeEnElPlan = includeEnElPlan;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }


    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es : " + getNombre());
        System.out.println("Su fecha de lanzamiento es : " + getFecheDeLanzamiento());
        System.out.println("Duracion en minutos:  " + getDuracionEnMinutos());

    }
    public void  evalua(double nota){
        sumaDeLasEvaluaciones +=nota;
        totalDeLasEvaluaciones++;

    }
    public double calculaMedia(){
        return sumaDeLasEvaluaciones /totalDeLasEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(nombre='" + nombre +
                ", fecheDeLanzamiento=" + fecheDeLanzamiento  +
                ", duracion = "+ duracionEnMinutos+")";
    }
}
