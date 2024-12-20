import com.aluracursos.screenmach.modelos.Pelicula;

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























        //com.aluracursos.screenmach.modelos.Pelicula otraPelicula = new com.aluracursos.screenmach.modelos.Pelicula();
        //otraPelicula.nombre= "Matrix";
        //otraPelicula.fecheDeLanzamiento  = 1998;
        //otraPelicula.duracionEnMinutos = 180;

        //otraPelicula.muestraFichaTecnica();


    }
}
