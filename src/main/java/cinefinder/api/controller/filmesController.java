package cinefinder.api.controller;

import cinefinder.api.cinema.DadosCadastroCine;
import cinefinder.api.cinema.DadosListagemCinema;
import cinefinder.api.filmes.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("filmes")
public class filmesController {

    @Autowired
    private FilmeRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroFilme dados) {
        System.out.println(dados);
        repository.save(new Filme(dados));
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



}
