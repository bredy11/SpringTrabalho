package br.com.sonnya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sonnya.model.Visita;
import br.com.sonnya.repository.VisitaRepositorio;

@Service
public class VisitaService {

	@Autowired
	VisitaRepositorio visitaRepositorio;

	public Visita buscarSeriePorId(Integer id) {

		return visitaRepositorio.findOne(id);
	}

	public List<Visita> buscarTodasAsSeries() {

		return visitaRepositorio.findAll();
	}

	public Visita alterarSerie(Visita visita) {

		visitaRepositorio.save(visita);
		return visita;
	}

	public Visita novaSerie(Visita visita) {

		return visitaRepositorio.save(visita);
	}

}
