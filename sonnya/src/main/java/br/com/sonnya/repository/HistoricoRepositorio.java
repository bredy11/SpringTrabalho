package br.com.sonnya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sonnya.model.Historico;

@Repository
public interface HistoricoRepositorio extends JpaRepository<Historico, Integer>  {

}
