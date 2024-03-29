package cinefinder.api.controller;

import cinefinder.api.entity.Cinema;
import cinefinder.api.repository.CinemaRepository;
import cinefinder.api.records.DadosCadastroCine;
import cinefinder.api.records.DadosListagemCinema;

import cinefinder.api.records.DadosEndereco;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("cinemas")
public class cinemaController {

    @Autowired
    private CinemaRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<String> cadastrar(@RequestBody @Valid DadosCadastroCine dados, UriComponentsBuilder uriBuilder){
        System.out.println(dados);
        repository.save(new Cinema(dados));
        var uri = uriBuilder.path("/cinemas/");

        return ResponseEntity.ok("Cinema cadastrado com sucesso.");
    }

    @GetMapping
    public ResponseEntity<Page<DadosListagemCinema>> listar(Pageable paginacao){
        var page =  repository.findAll(paginacao).map(DadosListagemCinema::new);
        return ResponseEntity.ok(page);
    }

    @PutMapping
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosEndereco dados) {
        var endereco = repository.getReferenceById(dados.ID());
        endereco.atualizarInformacoes(dados);

        return ResponseEntity.ok(dados);

    }

    @DeleteMapping("/{ID}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long ID){
        repository.deleteById(ID);

        return ResponseEntity.noContent().build();
    }

}
