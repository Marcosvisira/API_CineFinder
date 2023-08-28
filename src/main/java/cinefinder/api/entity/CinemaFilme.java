package cinefinder.api.entity;

import jakarta.persistence.*;

@Table(name = "cinemas_filmes")
@Entity(name = "cinemas_filmes")
public class CinemaFilme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_cinema")
    private Long idcinema;
    @Column(name = "id_filme")
    private Long idfilme;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdcinema() {
        return idcinema;
    }

    public void setIdcinema(Long idcinema) {
        this.idcinema = idcinema;
    }

    public Long getIdfilme() {
        return idfilme;
    }

    public void setIdfilme(Long idfilme) {
        this.idfilme = idfilme;
    }
}
