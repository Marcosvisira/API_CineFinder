package cinefinder.api.records;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoFilme(
        @NotNull
        Long ID,
        String tituloFilme,
        String sinopseFilme,
        String estreiaFilme,
        String filmeCartaz,
        String duracaoFilme,
        String classificacaoFilme,
        String generoFilme,
        String sessaoFilme,
        String artista) {
}
