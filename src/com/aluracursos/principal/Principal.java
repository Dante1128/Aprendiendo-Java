import com.aluracursos.screenmach.modelos.Episodio;
import com.aluracursos.screenmach.modelos.Pelicula;
import com.aluracursos.screenmach.modelos.Serie;
import com.aluracursos.screenmacth.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmacth.calculos.FiltroRecomendacion;

import java.util.ArrayList;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto",2023);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncludeEnElPlan(true);
        //miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        //System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        //System.out.println(miPelicula.calculaMedia());

        Serie casaDragon  = new Serie("Casa del Dragon", 2022 );
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        //casaDragon.muestraFichaTecnica();
        //System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix",1988);
        otraPelicula.setDuracionEnMinutos(180);
       // otraPelicula.muestraFichaTecnica();


        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        //System.out.println("Tiempo necesario para ver tus titulos favoritos en estas vacaciones "
               // +calculadora.getTiempoTotal() + " min");

        FiltroRecomendacion filtroRecomendacion =  new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryene");
        episodio.setSerie(casaDragon);
        episodio.setTotalDeVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);



        var peliculaDeBruno = new Pelicula("El semor de los anillos ",2001);
        peliculaDeBruno.setDuracionEnMinutos(180);



        ArrayList<Pelicula> listaDePelicualas  = new ArrayList<>();
        listaDePelicualas.add(peliculaDeBruno);
        listaDePelicualas.add(miPelicula);
        listaDePelicualas.add(otraPelicula);

        System.out.println("Tamamo de la lista: "+ listaDePelicualas.size() );
        System.out.println("La primera pelicula es: " + listaDePelicualas.get(0).getNombre());
        System.out.println(listaDePelicualas.toString());
        System.out.println("toString de la pelicula: " + listaDePelicualas.get(0).toString());






    }
}
