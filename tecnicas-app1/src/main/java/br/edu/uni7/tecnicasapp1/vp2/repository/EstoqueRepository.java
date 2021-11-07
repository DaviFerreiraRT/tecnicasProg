package br.edu.uni7.tecnicasapp1.vp2.repository;

import br.edu.uni7.tecnicasapp1.vp2.model.Estoque;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EstoqueRepository {
    private static Integer contador = 1;
    private static ArrayList<Estoque> EstoqueMap;

    public EstoqueRepository() {
        EstoqueMap = new ArrayList<>();
    }

    public Estoque [] getAll(){
        return EstoqueMap.toArray(new Estoque[0]);
    }
    public Optional<Estoque> findById(Integer id) {
        Optional<Estoque> estoque = EstoqueMap.stream().filter(e -> e.getId() == id ).findFirst();
        return estoque;
    }
    public Optional<Estoque> update(Integer id,String nome, String fabricante, Integer qntEstoque,double preco) {
        Optional<Estoque> e = EstoqueMap.stream().filter(e1 -> e1.getId() == id ).findFirst();

        e.get().setId(id);
        e.get().setNome(nome);
        e.get().setFabricante(fabricante);
        e.get().setQntEstoque(qntEstoque);
        e.get().setPreco(preco);
        return e;
    }

    public Estoque create(Estoque estoque, String nome, double preco, String fabricante, int qntEstoque) {
        int id = contador;
        contador++;
        EstoqueMap.add(estoque);
        estoque.setId(id);

        return estoque;
    }

    public void delete(Integer id) {
        for(int i = 0; i<EstoqueMap.size();i++){
            if(EstoqueMap.get(i).getId() == id){
                EstoqueMap.remove(i);
                break;
            }
        }
    }
}
