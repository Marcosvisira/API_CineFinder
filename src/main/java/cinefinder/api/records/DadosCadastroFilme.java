package cinefinder.api.records;

import cinefinder.api.entity.Cinema;

import java.util.List;

public record DadosCadastroFilme(String tituloFilme, String sinopseFilme, String estreiaFilme, String filmeCartaz, String duracaoFilme,
                                 String classificacaoFilme, String generoFilme, String sessaoFilme, String artista, List<Long> cinema) {
}
