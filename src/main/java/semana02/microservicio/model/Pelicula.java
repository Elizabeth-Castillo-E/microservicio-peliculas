package semana02.microservicio.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "peliculas")
public class Pelicula {

     public Pelicula(){
            
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column (name = "titulo")
    private String titulo;

   @Column (name = "anio")
    private int anio;

    @Column (name = "director")
    private String director;

    @Column (name = "genero")
    private String genero;

    @Column (name = "sinopsis")
    private String sinopsis;

    @Column (name = "valoracion")
    private String valoracion;

    

   

    public Long getId() {
        return id;
    }

    public String getValoracion() {
        return valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }
   
   
}