package br.edu.uni7.tecnicasapp1.vp2.repository;

import br.edu.uni7.tecnicasapp1.vp2.model.Estoque;
import br.edu.uni7.tecnicasapp1.vp2.model.Servico;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ServicoRepository {
    private static Integer contador = 1;
    private final Map<Integer, Servico> ServicoMap;

    public ServicoRepository() {
        ServicoMap = new HashMap<>();
    }

    public List<Estoque> list() {
        return new ArrayList(ServicoMap.values());
    }

    public Servico findById(Integer id) {
        if(ServicoMap.containsKey(id)){
            return ServicoMap.get(id);
        }
        return null;

    }
    public Servico update(Integer id, Servico servico) {
        if (!ServicoMap.containsKey(id)) {
            throw new IllegalArgumentException("estoque inexistente");
        }

        ServicoMap.put(id, servico);
        return servico;
    }

    public Servico create(Servico servico,double maoDeObra){
        int id = contador;
        contador++;
        servico.setPrecoTotal(maoDeObra);
        ServicoMap.put(id, servico);
        servico.setId(id);

        return servico;
    }

    public void delete(Integer id) {
        ServicoMap.remove(id);
    }
}
