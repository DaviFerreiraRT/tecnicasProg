package br.edu.uni7.tecnicasapp1.vp2.controller;

import br.edu.uni7.tecnicasapp1.vp2.model.Estoque;
import br.edu.uni7.tecnicasapp1.vp2.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EstoqueController {

    private final EstoqueRepository repository;

    @Autowired
    public EstoqueController(EstoqueRepository repository) {
        this.repository = repository;
    }

    @ResponseBody
    @RequestMapping(value = "estoque", method = RequestMethod.GET)
    public List<Estoque> list() {
        return repository.list();
    }

    @ResponseBody
    @RequestMapping(value = "estoque/{id}", method = RequestMethod.GET)
    public Estoque findById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @ResponseBody
    @RequestMapping(value = "estoque/{id}", method = RequestMethod.PUT)
    public Estoque update(Integer id, Estoque estoque) {
        return repository.update(id, estoque);
    }

    @ResponseBody
    @RequestMapping(value = "estoque", method = RequestMethod.POST)
    public Estoque create(Estoque estoque, @RequestBody String nomeProduto, @RequestBody String precoProduto) {
        return repository.create(estoque,nomeProduto,precoProduto);
    }

    @ResponseBody
    @RequestMapping(value = "estoque/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }

}