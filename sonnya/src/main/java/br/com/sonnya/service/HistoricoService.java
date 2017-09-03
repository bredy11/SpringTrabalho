package br.com.sonnya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sonnya.model.Historico;
import br.com.sonnya.repository.HistoricoRepositorio;

@Service
public class HistoricoService {

	@Autowired
	HistoricoRepositorio historicoRepositorio;

	public Historico buscarSeriePorId(Integer id) {

		return historicoRepositorio.findOne(id);
	}

	public List<Historico> buscarTodasAsSeries() {

		return historicoRepositorio.findAll();
	}

	public Historico alterarSerie(Historico historico) {

		historicoRepositorio.save(historico);
		return historico;
	}

	public Historico novaSerie(Historico historico) {

		return historicoRepositorio.save(historico);
	}

}
