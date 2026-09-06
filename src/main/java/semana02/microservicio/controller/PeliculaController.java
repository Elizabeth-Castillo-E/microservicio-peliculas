package semana02.microservicio.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import semana02.microservicio.model.Pelicula;
import semana02.microservicio.service.PeliculaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import java.util.Map;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping ("/peliculas")
public class PeliculaController {

    @Autowired 
    private PeliculaService peliculaService;
    
    @GetMapping
    public List<Pelicula> obtenerPeliculas() {
        return peliculaService.getAllPeliculas();
    }

    // Devuelve una pelicula segun su ID.
    @GetMapping("/{id}")
public ResponseEntity<?> obtenerPeliculaPorId(@PathVariable Long id) {

    Optional<Pelicula> peliculaEncontrada = peliculaService.getPeliculaById(id);

    if (peliculaEncontrada.isPresent()) {
        return ResponseEntity.ok(peliculaEncontrada.get());
    }

    return ResponseEntity
            .status(HttpStatus.NOT_FOUND)
            .body(Map.of(
                    "mensaje", "lo siento, su pelicula no fue encontrada, trabajaremos para mejorar nuestro servicio",
                    "id", id
            ));
}
}