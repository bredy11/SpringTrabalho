package br.com.sonnya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sonnya.model.Comercio;

@Repository
public interface ComercioRepositorio extends JpaRepository<Comercio, Integer>  {

}
