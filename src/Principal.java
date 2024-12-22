import com.aluracursos.screenmach.modelos.Pelicula;
import com.aluracursos.screenmach.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto");
        miPelicula.setFecheDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncludeEnElPlan(true);
        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon  = new Serie();
        casaDragon.setNombre("Casa del Dragon");
        casaDragon.setFecheDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();

        System.out.println(casaDragon.getDuracionEnMinutos());























        //com.aluracursos.screenmach.modelos.Pelicula otraPelicula = new com.aluracursos.screenmach.modelos.Pelicula();
        //otraPelicula.nombre= "Matrix";
        //otraPelicula.fecheDeLanzamiento  = 1998;
        //otraPelicula.duracionEnMinutos = 180;

        //otraPelicula.muestraFichaTecnica();


    }
}
