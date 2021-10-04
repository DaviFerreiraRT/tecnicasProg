package br.edu.uni7.tecnicasapp1.controller;

import br.edu.uni7.tecnicasapp1.model.Materia;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MeuController {

    @RequestMapping("/materia")
    public String materia(Model model) {
        List<Materia> materias = new ArrayList<>();
        materias.add(new Materia("A história de Nem", "o rato roeu 1","algo aqui"));
        materias.add(new Materia("O crime do Lago Ness", "o rato roeu 2", "muito interessante"));
        materias.add(new Materia("O Futebol do dia ", "o rato roeu 3","7x1 de cada dia"));
        materias.add(new Materia("O caso de Woonderwood", "o rato roeu 4","fantastico"));

        model.addAttribute("materias", materias);
        return "materia";
    }

}
