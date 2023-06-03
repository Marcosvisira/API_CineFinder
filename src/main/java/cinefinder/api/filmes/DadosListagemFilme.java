package cinefinder.api.filmes;

import cinefinder.api.cinema.Cinema;

public record DadosListagemFilme(Long ID, String tituloFilme, String sinopseFilme, String estreiaFilme, String filmeCartaz, double duracaoFilme,
                                 int classificacaoFilme, String generoFilme, String sessaoFilme, String artista)
{
    public DadosListagemFilme(Filme filme){
        this(filme.getId(), filme.getTituloFilme(), filme.getSinopseFilme(), filme.getEstreiaFilme(), filme.getFilmeCartaz(), filme.getDuracaoFilme(), filme.getClassificacaoFilme(),
                filme.getGeneroFilme(), filme.getSessaoFilme(), filme.getArtista());
    }


}
