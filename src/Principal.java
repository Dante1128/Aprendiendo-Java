public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fecheDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;
        miPelicula.duracionEnMinutos = 120;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(7.8);
        miPelicula.evalua(18);
        System.out.println(miPelicula.sumaDeLasEvaluaciones);


        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre= "Matrix";
        otraPelicula.fecheDeLanzamiento  = 1998;
        otraPelicula.duracionEnMinutos = 180;

        //otraPelicula.muestraFichaTecnica();


    }
}
