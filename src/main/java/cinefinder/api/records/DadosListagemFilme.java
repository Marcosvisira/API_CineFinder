package cinefinder.api.records;

import cinefinder.api.entity.Filme;

public record DadosListagemFilme(Long ID, String tituloFilme, String sinopseFilme, String estreiaFilme, String filmeCartaz, String duracaoFilme,
                                 String classificacaoFilme, String generoFilme, String sessaoFilme, String artista)
{
    public DadosListagemFilme(Filme filme){
        this(filme.getId(), filme.getTituloFilme(), filme.getSinopseFilme(), filme.getEstreiaFilme(), filme.getFilmeCartaz(),
                filme.getDuracaoFilme(), filme.getClassificacaoFilme(),
                filme.getGeneroFilme(), filme.getSessaoFilme(), filme.getArtista());
    }


}
