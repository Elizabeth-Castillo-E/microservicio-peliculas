package semana02.microservicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import java.util.Map;
import java.util.Optional;

import java.util.List;

@RestController
@RequestMapping
public class PeliculaController {

    private final List<Pelicula> peliculas = List.of(
    new Pelicula(
        1,
        "Juego de gemelas",
        1998,
        "Nancy Meyers",
        "Comedia familiar",
        "Dos hermanas gemelas separadas al nacer se encuentran en un campamento y planean reunir a sus padres.", 
        "8.9/10"
    ),
    new Pelicula(
        2,
        "Insidious",
        2010,
        "James Wan",
        "Terror",
        "Una familia intenta proteger a su hijo de entidades sobrenaturales que buscan apoderarse de él.", 
        "7.5/10"
    ),
    new Pelicula(
        3,
        "El viaje de Chihiro",
        2001,
        "Hayao Miyazaki",
        "Animación y fantasía",
        "Una niña entra en un mundo habitado por espíritus y debe encontrar la manera de salvar a sus padres.", 
        "9.1/10"
    ),
    new Pelicula(
        4,
        "Búsqueda implacable",
        2008,
        "Pierre Morel",
        "Acción y suspenso",
        "Un antiguo agente utiliza sus habilidades para encontrar y rescatar a su hija secuestrada.", 
        "7.8/10"
    ),
    new Pelicula(
        5,
        "John Wick",
        2014,
        "Chad Stahelski",
        "Acción",
        "Un asesino retirado regresa al mundo criminal para buscar venganza.", 
        "7.3/10"
    ),
    new Pelicula(
        6,
        "El padrino",
        1972,
        "Francis Ford Coppola",
        "Drama",
        "La historia de una poderosa familia de la mafia.",
        "9.2/10"
    ),
    new Pelicula(
        7,
        "Interestelar",
        2014,
        "Christopher Nolan",
        "Ciencia ficcion",
        "Un grupo de astronautas busca un nuevo hogar para la humanidad.",
        "8.6/10"
    ),
    new Pelicula(
        8,
        "Parasitos",
        2019,
        "Bong Joon-ho",
        "Suspenso",
        "Una familia se introduce poco a poco en la vida de otra familia adinerada.",
        "8.6/10"
    ),
    
    new Pelicula(
        9,
        "Volver al futuro",
        1985,
        "Robert Zemeckis",
        "Ciencia ficcion",
        "Un adolescente viaja accidentalmente al pasado en una maquina del tiempo.",
        "8.5/10"
    )
);
    
    @GetMapping({"/peliculas", "/peliculas"})
    public List<Pelicula> obtenerPeliculas() {
        return peliculas;
    }

    // Devuelve una pelicula segun su ID.
    @GetMapping("/peliculas/{id}")
public ResponseEntity<?> obtenerPeliculaPorId(@PathVariable int id) {

    Optional<Pelicula> peliculaEncontrada = peliculas.stream()
            .filter(pelicula -> pelicula.getId() == id)
            .findFirst();

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