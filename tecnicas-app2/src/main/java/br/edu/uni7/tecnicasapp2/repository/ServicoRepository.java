package br.edu.uni7.tecnicasapp2.repository;

import br.edu.uni7.tecnicasapp2.model.Servico;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ServicoRepository extends JpaRepository<Servico,Integer> {
}
