package br.com.sonnya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sonnya.model.Visita;

@Repository
public interface VisitaRepositorio extends JpaRepository<Visita, Integer>  {

}
