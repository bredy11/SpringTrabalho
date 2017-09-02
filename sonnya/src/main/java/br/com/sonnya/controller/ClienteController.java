package br.com.sonnya.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sonnya.model.Comercio;
import br.com.sonnya.service.ComercioService;

@RestController
public class ClienteController {

	
	@Autowired
	ComercioService comercioService;
	
	//negocio
	

	//end point
	/*
	@RequestMapping(method = RequestMethod.POST,value="/series",
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Serie> cadastrar(@RequestBody Serie serie) {
		
		
		return new ResponseEntity<Serie>(cadastraServler(serie),HttpStatus.CREATED);
	}*/
	
	
	@RequestMapping(method = RequestMethod.GET,value="/comercios",	
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Comercio>> BuscarTodos() {
		
		Collection<Comercio> seriesColec = comercioService.buscarTodasAsSeries(); 
		return new ResponseEntity<>(seriesColec,HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/comercios",	
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Comercio> alterar(@RequestBody Comercio comercio) {
	
		Comercio comercioSalvo = comercioService.alterarSerie(comercio); 
		return new ResponseEntity<>(comercioSalvo,HttpStatus.OK);
	}
	
	/*
	@RequestMapping(method = RequestMethod.DELETE,value="/series/{id}",	
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Serie>> deletar(@PathVariable Integer id) {
		remover(id);
		Collection<Serie> seriesColec = buscartodosService(); 
		return new ResponseEntity<>(seriesColec,HttpStatus.OK);
	}
	
	/*
	
	@RequestMapping(method = RequestMethod.GET,value="/series")
	public void buscar() {
		System.out.println("teste");
	}
	*/
	
	
}
