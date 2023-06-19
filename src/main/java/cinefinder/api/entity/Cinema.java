package cinefinder.api.entity;


import cinefinder.api.records.DadosCadastroCine;
import cinefinder.api.records.DadosEndereco;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "cinemas")
@Entity(name = "Cinema")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cinema {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;


    private String nomeFantasia;
    private String cnpj;

    @Embedded
    private Endereco endereco;

    @ManyToMany(mappedBy = "cinemas")
    @JsonManagedReference
    private List<Filme> filmes;



    public Cinema(DadosCadastroCine dados){
        this.nome = dados.nome();
        this.nomeFantasia = dados.nomefantasia();
        this.cnpj = dados.cnpj();
        this.endereco = new Endereco(dados.endereco());
        this.nomeFantasia = dados.nomefantasia();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if(dados.logradouro() != null){
            this.endereco.setLogradouro(dados.logradouro());
        }
        if(dados.cidade() != null){
            this.endereco.setCidade(dados.cidade());
        }
        if(dados.uf() != null){
            this.endereco.setUf(dados.cidade());
        }
        if(dados.cep() != null){
            this.endereco.setCep(dados.cidade());
        }
        if(dados.bairro() != null){
            this.endereco.setBairro(dados.bairro());
        }
        if(dados.numero() != null){
            this.endereco.setNumero(dados.numero());
        }
        if(dados.complemento() != null){
            this.endereco.setComplemento(dados.complemento());
        }


    }
}
