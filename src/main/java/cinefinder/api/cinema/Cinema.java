package cinefinder.api.cinema;


import cinefinder.api.endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

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


    public Cinema(DadosCadastroCine dados){
        this.nome = dados.nome();
        this.nomeFantasia = dados.nomefantasia();
        this.cnpj = dados.cnpj();
        this.endereco = new Endereco(dados.endereco());
        this.nomeFantasia = dados.nomefantasia();
    }

}
