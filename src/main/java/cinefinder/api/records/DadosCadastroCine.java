package cinefinder.api.records;


import jakarta.validation.Valid;

public record DadosCadastroCine(

        String nome,

        String nomefantasia,


        String cnpj,

        @Valid
        DadosEndereco endereco) {

}
