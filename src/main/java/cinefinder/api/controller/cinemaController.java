package cinefinder.api.controller;

import cinefinder.api.entity.Cinema;
import cinefinder.api.entity.Endereco;
import cinefinder.api.repository.CinemaRepository;
import cinefinder.api.records.DadosCadastroCine;
import cinefinder.api.records.DadosListagemCinema;

import cinefinder.api.records.DadosEndereco;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("cinemas")
public class cinemaController {

    @Autowired
    private CinemaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCine dados){
        System.out.println(dados);
        repository.save(new Cinema(dados));
    }

    @GetMapping
    public Page<DadosListagemCinema> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemCinema::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosEndereco dados) {
        var endereco = repository.getReferenceById(dados.ID());
        endereco.atualizarInformacoes(dados);
    }
}
