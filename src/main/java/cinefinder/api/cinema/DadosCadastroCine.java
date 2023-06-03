package cinefinder.api.cinema;


import cinefinder.api.endereco.DadosEndereco;
import jakarta.validation.Valid;

import jakarta.validation.constraints.Pattern;

public record DadosCadastroCine(

        String nome,

        String nomefantasia,


        String cnpj,

        @Valid
        DadosEndereco endereco) {

}
