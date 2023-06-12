package cinefinder.api.records;

import cinefinder.api.entity.Endereco;
import cinefinder.api.entity.Cinema;

public record DadosListagemCinema(Long ID, String nome, String nomeFantasia, Endereco endereco) {

    public DadosListagemCinema(Cinema cinema){
        this(cinema.getId(), cinema.getNome(), cinema.getNomeFantasia(), cinema.getEndereco());
    }

}
