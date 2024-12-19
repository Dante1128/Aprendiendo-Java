public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fecheDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("Mi pelicula es : " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es : " + miPelicula.fecheDeLanzamiento);
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre= "Matrix";
        otraPelicula.fecheDeLanzamiento  = 1998;
        otraPelicula.duracionEnMinutos = 180;

        System.out.println("Mi pelicula es : " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es : " + otraPelicula.fecheDeLanzamiento);


    }
}
