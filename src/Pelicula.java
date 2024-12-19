public class Pelicula {
    String nombre ;
    int fecheDeLanzamiento;
    int duracionEnMinutos;
    boolean includeEnElPlan;
    double sumaDeLasEvaluaciones;
    void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es : " + nombre);
        System.out.println("Su fecha de lanzamiento es : " + fecheDeLanzamiento);
        System.out.println("Duracion en minutos:  " + duracionEnMinutos);

    }
    void  evalua(double nota){
        sumaDeLasEvaluaciones +=nota;

    }
}


