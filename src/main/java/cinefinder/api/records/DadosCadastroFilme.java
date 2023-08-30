package cinefinder.api.records;

import java.util.List;

public record DadosCadastroFilme(String tituloFilme, String sinopseFilme, String estreiaFilme, String filmeCartaz, String duracaoFilme,
                                 String classificacaoFilme, String generoFilme, String sessaoFilme, String artista, List<Long> cinema) {
}
