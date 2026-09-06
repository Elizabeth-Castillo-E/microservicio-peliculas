package semana02.microservicio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import semana02.microservicio.model.Pelicula;
import semana02.microservicio.repository.PeliculasRepository;

@Service
public class PeliculaServiceImpl implements PeliculaService {

    private final PeliculasRepository peliculasRepository;

    public PeliculaServiceImpl(
            PeliculasRepository peliculasRepository) {
        this.peliculasRepository = peliculasRepository;
    }

    @Override
    public List<Pelicula> getAllPeliculas() {
        return peliculasRepository.findAll();
    }

    @Override
    public Optional<Pelicula> getPeliculaById(Long id) {
        return peliculasRepository.findById(id);
    }
}