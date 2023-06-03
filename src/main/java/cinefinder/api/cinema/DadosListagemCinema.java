package cinefinder.api.cinema;

import cinefinder.api.endereco.Endereco;

public record DadosListagemCinema(Long ID, String nome, String nomeFantasia, Endereco endereco) {

    public DadosListagemCinema(Cinema cinema){
        this(cinema.getId(), cinema.getNome(), cinema.getNomeFantasia(), cinema.getEndereco());
    }

}
