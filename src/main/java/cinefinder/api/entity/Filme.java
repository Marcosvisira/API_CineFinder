package cinefinder.api.entity;

import cinefinder.api.records.DadosAtualizacaoFilme;
import cinefinder.api.records.DadosCadastroFilme;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "filmes")
@Entity(name = "Filme")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tituloFilme;
    private String sinopseFilme;
    private String estreiaFilme;
    private String filmeCartaz;
    private String duracaoFilme;
    private String classificacaoFilme;
    private String generoFilme;
    private String sessaoFilme;
    private String artista;

    @ManyToMany
    @JoinTable(name = "cinemas_filmes",
            joinColumns = @JoinColumn(name = "id_filme"),
            inverseJoinColumns = @JoinColumn(name = "id_cinema"))
    @JsonBackReference
    private List<Cinema> cinemas;



    public Filme(DadosCadastroFilme dados) {
        this.tituloFilme = dados.tituloFilme();
        this.sinopseFilme = dados.sinopseFilme();
        this.estreiaFilme = dados.estreiaFilme();
        this.filmeCartaz = dados.filmeCartaz();
        this.duracaoFilme = dados.duracaoFilme();
        this.classificacaoFilme = dados.classificacaoFilme();
        this.generoFilme = dados.generoFilme();
        this.sessaoFilme = dados.sessaoFilme();
        this.artista = dados.artista();


    }

    public void atualizarInformacoes(DadosAtualizacaoFilme dados) {
        if (dados.tituloFilme() != null) {
            this.tituloFilme = dados.tituloFilme();
        }
        if (dados.sinopseFilme() != null) {
            this.sinopseFilme = dados.sinopseFilme();
        }
        if (dados.estreiaFilme() != null) {
            this.estreiaFilme = dados.estreiaFilme();
        }
        if (dados.filmeCartaz() != null) {
            this.filmeCartaz = dados.filmeCartaz();
        }
        if (dados.duracaoFilme() != null) {
            this.duracaoFilme = dados.duracaoFilme();
        }
        if (dados.classificacaoFilme() != null) {
            this.classificacaoFilme = dados.classificacaoFilme();
        }
        if (dados.generoFilme() != null) {
            this.generoFilme = dados.generoFilme();
        }
        if (dados.sessaoFilme() != null) {
            this.sessaoFilme = dados.sessaoFilme();
        }
        if (dados.artista() != null) {
            this.artista = dados.artista();
        }


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getSinopseFilme() {
        return sinopseFilme;
    }

    public void setSinopseFilme(String sinopseFilme) {
        this.sinopseFilme = sinopseFilme;
    }

    public String getEstreiaFilme() {
        return estreiaFilme;
    }

    public void setEstreiaFilme(String estreiaFilme) {
        this.estreiaFilme = estreiaFilme;
    }

    public String getFilmeCartaz() {
        return filmeCartaz;
    }

    public void setFilmeCartaz(String filmeCartaz) {
        this.filmeCartaz = filmeCartaz;
    }

    public String getDuracaoFilme() {
        return duracaoFilme;
    }

    public void setDuracaoFilme(String duracaoFilme) {
        this.duracaoFilme = duracaoFilme;
    }

    public String getClassificacaoFilme() {
        return classificacaoFilme;
    }

    public void setClassificacaoFilme(String classificacaoFilme) {
        this.classificacaoFilme = classificacaoFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public String getSessaoFilme() {
        return sessaoFilme;
    }

    public void setSessaoFilme(String sessaoFilme) {
        this.sessaoFilme = sessaoFilme;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public List<Cinema> getCinemas() {
        return cinemas;
    }

    public void setCinemas(List<Cinema> cinemas) {
        this.cinemas = cinemas;
    }
}