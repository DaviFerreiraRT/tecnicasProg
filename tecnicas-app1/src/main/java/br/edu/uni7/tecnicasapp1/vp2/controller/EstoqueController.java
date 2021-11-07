package br.edu.uni7.tecnicasapp1.vp2.controller;

import br.edu.uni7.tecnicasapp1.vp2.model.Estoque;
import br.edu.uni7.tecnicasapp1.vp2.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class EstoqueController {

    private final EstoqueRepository repository;

    @Autowired
    public EstoqueController(EstoqueRepository repository) {
        this.repository = repository;
    }

    @ResponseBody
    @RequestMapping(value = "estoque/{id}",method = RequestMethod.GET)
    public Optional<Estoque> findById(@PathVariable Integer id) {
        return repository.findById(id);
    }

    @ResponseBody
    @GetMapping(value = "estoque")
    public Estoque [] getAll(){
        return repository.getAll();
    }


    @ResponseBody
    @RequestMapping(value = "estoque", method = RequestMethod.PUT)
    public Optional<Estoque> update(@RequestBody Estoque estoque) {
        return repository.update(estoque.getId(), estoque.getNome(),estoque.getFabricante(), estoque.getQntEstoque(),estoque.getPreco());
    }

    @ResponseBody
    @RequestMapping(value = "estoque", method = RequestMethod.POST)
    public Estoque create(@RequestBody Estoque estoque) {

        return repository.create(estoque, estoque.getNome(), estoque.getPreco(), estoque.getFabricante(), estoque.getQntEstoque());
    }

    @ResponseBody
    @RequestMapping(value = "estoque/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Integer id) {
        repository.delete(id);
    }

}