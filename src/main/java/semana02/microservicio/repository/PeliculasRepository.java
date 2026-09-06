package semana02.microservicio.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import semana02.microservicio.model.Pelicula;


public interface PeliculasRepository extends JpaRepository<Pelicula, Long> {
    
}
