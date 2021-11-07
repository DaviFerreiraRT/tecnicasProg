package br.edu.uni7.tecnicasapp1.vp2.controller;

import br.edu.uni7.tecnicasapp1.vp2.model.Servico;
import br.edu.uni7.tecnicasapp1.vp2.repository.EstoqueRepository;
import br.edu.uni7.tecnicasapp1.vp2.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ServicoController {
    private final ServicoRepository repository;
    private EstoqueRepository estoqueRepo;
    @Autowired
    public ServicoController(ServicoRepository repository) {
        this.repository = repository;
    }

    @ResponseBody
    @RequestMapping(value = "servico/{id}",method = RequestMethod.GET)
    public Servico findById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "servico/{id}", method = RequestMethod.PUT)
    public Servico update(Integer id, Servico servico) {
        return repository.update(id, servico);
    }

    @ResponseBody
    @RequestMapping(value = "servico", method = RequestMethod.POST)
    public Servico create(@RequestBody Servico servico) {
        return repository.create(servico, servico.getMaoDeObra());
    }

    @ResponseBody
    @RequestMapping(value = "servico/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }
}
