package br.com.sonnya.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sonnya.model.Comercio;
import br.com.sonnya.repository.ComercioRepositorio;

@Service
public class ComercioService {

	@Autowired
	ComercioRepositorio comercioRepositorio;

	public Comercio buscarSeriePorId(Integer id) {

		return comercioRepositorio.findOne(id);
	}

	public List<Comercio> buscarTodasAsSeries() {

		return comercioRepositorio.findAll();
	}

	public Comercio alterarSerie(Comercio comercio) {

		comercioRepositorio.save(comercio);
		return comercio;
	}

	public Comercio novaSerie(Comercio comercio) {

		return comercioRepositorio.save(comercio);
	}

	public Collection<Comercio> delete(Integer id) {
		comercioRepositorio.delete(id);
		return comercioRepositorio.findAll();
	}

}
