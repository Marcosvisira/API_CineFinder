package cinefinder.api.filmes;

public record DadosCadastroFilme(String tituloFilme, String sinopseFilme, String estreiaFilme, String filmeCartaz, double duracaoFilme,
                                 int classificacaoFilme, String generoFilme, String sessaoFilme, String artista) {
}
