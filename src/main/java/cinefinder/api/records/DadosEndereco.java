package cinefinder.api.records;




public record DadosEndereco(Long ID,
                            String logradouro,

                            String cidade,

                            String uf,


                            String cep,

                            String bairro,

                            String numero,

                            String complemento ) {

}
