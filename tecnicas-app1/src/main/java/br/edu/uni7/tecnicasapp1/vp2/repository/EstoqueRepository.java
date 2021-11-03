package br.edu.uni7.tecnicasapp1.vp2.repository;

import br.edu.uni7.tecnicasapp1.vp2.model.Estoque;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EstoqueRepository {
    private static Integer contador = 1;
    private final Map<Integer, Estoque> EstoqueMap;

    public EstoqueRepository() {
        EstoqueMap = new HashMap<>();
    }

    public List<Estoque> list() {
        return new ArrayList<>(EstoqueMap.values());
    }

    public Estoque findById(Integer id) {
        if(EstoqueMap.containsKey(id)){
            return EstoqueMap.get(id);
        }
        return null;

    }
    public Estoque update(Integer id, Estoque estoque) {
        if (!EstoqueMap.containsKey(id)) {
            throw new IllegalArgumentException("estoque inexistente");
        }

        EstoqueMap.put(id, estoque);
        return estoque;
    }

    public Estoque create(Estoque estoque,String nome, double preco,String fabricante,int qntEstoque) {
        int id = contador;
        contador++;
        EstoqueMap.put(id, estoque);
        estoque.setId(id);

        return estoque;
    }

    public void delete(Integer id) {
        EstoqueMap.remove(id);
    }
}
