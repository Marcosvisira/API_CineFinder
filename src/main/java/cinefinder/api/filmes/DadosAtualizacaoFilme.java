package cinefinder.api.filmes;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoFilme(
        @NotNull
        Long ID,
        String tituloFilme,
        String sinopseFilme,
        String estreiaFilme,
        String filmeCartaz,
        double duracaoFilme,
        int classificacaoFilme,
        String generoFilme,
        String sessaoFilme,
        String artista) {
}
