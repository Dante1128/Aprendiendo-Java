package com.aluracursos.screenmach.modelos;

public class Titulo {
    private String nombre ;
    private int fecheDeLanzamiento;
    private int duracionEnMinutos;
    private boolean includeEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public Titulo(String nombre, int fecheDeLanzamiento) {
        this.nombre = nombre;
        this.fecheDeLanzamiento = fecheDeLanzamiento;
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

}
