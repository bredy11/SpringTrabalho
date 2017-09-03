package br.com.sonnya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sonnya.model.Venda;

@Repository
public interface VendaRepositorio extends JpaRepository<Venda, Integer>  {

}
