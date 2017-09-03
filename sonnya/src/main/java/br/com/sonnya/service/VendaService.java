package br.com.sonnya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sonnya.model.Venda;
import br.com.sonnya.repository.VendaRepositorio;

@Service
public class VendaService {

	@Autowired
	VendaRepositorio vendaRepositorio;

	public Venda buscarSeriePorId(Integer id) {

		return vendaRepositorio.findOne(id);
	}

	public List<Venda> buscarTodasAsSeries() {

		return vendaRepositorio.findAll();
	}

	public Venda alterarSerie(Venda venda) {

		vendaRepositorio.save(venda);
		return venda;
	}

	public Venda novaSerie(Venda venda) {

		return vendaRepositorio.save(venda);
	}

}
