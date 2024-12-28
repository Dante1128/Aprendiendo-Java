package com.aluracursos.principal;

import com.aluracursos.screenmach.modelos.Pelicula;
import com.aluracursos.screenmach.modelos.Serie;
import com.aluracursos.screenmach.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto",2023);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix",1988);
        otraPelicula.evalua(9);
        var peliculaDeBruno = new Pelicula("El semor de los anillos ",2001);
        peliculaDeBruno.evalua(8);
        Serie casaDragon  = new Serie("Casa del Dragon", 2022 );
        casaDragon.evalua(7);



        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);

        lista.add(otraPelicula);

        lista.add(peliculaDeBruno);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {

                System.out.println(pelicula.getClasificacion());

            }


        }
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Atonio Banderas");
        listaDeArtistas.add("Ricardo Darin");

        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de Artistas  ordenada: " +listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada de titulos" + lista);

        lista.sort(Comparator.comparing(Titulo::getFecheDeLanzamiento));
        System.out.println("Lista ordenada por fecha" + lista);





    }
}
