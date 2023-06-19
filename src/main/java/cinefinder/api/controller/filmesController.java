package cinefinder.api.controller;

import cinefinder.api.entity.Cinema;
import cinefinder.api.entity.CinemaFilme;
import cinefinder.api.entity.Filme;
import cinefinder.api.records.DadosAtualizacaoFilme;
import cinefinder.api.records.DadosCadastroFilme;
import cinefinder.api.records.DadosListagemFilme;
import cinefinder.api.repository.CinemaFilmeRepository;
import cinefinder.api.repository.CinemaRepository;
import cinefinder.api.repository.FilmeRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("filmes")
public class filmesController {

    @Autowired
    private FilmeRepository repository;

    @Autowired
    private CinemaFilmeRepository cinemaFilmeRepository;

    @Autowired
    private CinemaRepository cinemaRepository;

    @PostMapping
    public ResponseEntity<?> criarFilme(@RequestBody DadosCadastroFilme dados) {
        Filme filme = new Filme(dados);
        // Busca os cinemas pelo ID e adiciona ao filme
        List<Cinema> cinemas = cinemaRepository.findAllByID(dados.cinema());
        filme.setCinemas(cinemas);
        filme = repository.save(filme);
        return ResponseEntity.ok("Filme criado com sucesso.");
    }

    @GetMapping
    public Page<DadosListagemFilme> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemFilme::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoFilme dados){
        var filme = repository.getReferenceById(dados.ID());
        filme.atualizarInformacoes(dados);

    }

    @DeleteMapping("/{ID}")
    @Transactional
    public void excluir(@PathVariable Long ID) {
        repository.deleteById(ID);
    }


    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity<List<Filme>> listarFilmes(@PathVariable Long id){
       // return repository.findAll(paginacao).map(DadosListagemFilme::new);
        return ResponseEntity.ok(repository.getFilmeByIdCinema(id));
    }

}
