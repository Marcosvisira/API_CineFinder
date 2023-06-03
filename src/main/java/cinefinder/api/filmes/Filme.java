package cinefinder.api.filmes;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    private double duracaoFilme;
    private int classificacaoFilme;
    private String generoFilme;
    private String sessaoFilme;
    private String artista;


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
        if (dados.tituloFilme() != null) {
            this.sinopseFilme = dados.sinopseFilme();
        }
        if (dados.tituloFilme() != null) {
            this.estreiaFilme = dados.estreiaFilme();
        }
        if (dados.tituloFilme() != null) {
            this.filmeCartaz = dados.filmeCartaz();
        }
        if (dados.tituloFilme() != null) {
            this.duracaoFilme = dados.duracaoFilme();
        }
        if (dados.tituloFilme() != null) {
            this.classificacaoFilme = dados.classificacaoFilme();
        }
        if (dados.tituloFilme() != null) {
            this.generoFilme = dados.generoFilme();
        }
        if (dados.tituloFilme() != null) {
            this.sessaoFilme = dados.sessaoFilme();
        }
        if (dados.tituloFilme() != null) {
            this.artista = dados.artista();
        }

    }
}