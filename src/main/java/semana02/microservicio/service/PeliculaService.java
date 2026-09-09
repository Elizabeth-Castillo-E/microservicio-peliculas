package semana02.microservicio.service;

import java.util.List;
import java.util.Optional;

import semana02.microservicio.model.Pelicula;

public interface PeliculaService {

    List<Pelicula> getAllPeliculas();

    Optional<Pelicula> getPeliculaById(Long id);

    Pelicula savePelicula(Pelicula pelicula);
    Pelicula updatePelicula(Long id, Pelicula pelicula);
    void deletePelicula(Long id);
}
