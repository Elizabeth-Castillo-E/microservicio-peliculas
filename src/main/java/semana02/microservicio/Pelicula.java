package semana02.microservicio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pelicula {

    private int id;
    private String titulo;

    @JsonProperty("anio")
    private int anio;

    private String director;

    @JsonProperty("genero")
    private String genero;

    private String sinopsis;
    private String valoracion;

    public Pelicula(
            int id,
            String titulo,
            int anio,
            String director,
            String genero,
            String sinopsis,
            String valoracion) {
                this.id = id;
                this.titulo = titulo;
                this.anio = anio;
                this.director = director;
                this.genero = genero;
                this.sinopsis = sinopsis;
                this.valoracion = valoracion;
    }

   

    public int getId() {
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
   
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }
    public void setAnio(int anio) {
        this.anio = anio;   
    }
    
    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    } 
    
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    public void setValoracion(String valoracion) {
        this.valoracion = valoracion;
    }
}