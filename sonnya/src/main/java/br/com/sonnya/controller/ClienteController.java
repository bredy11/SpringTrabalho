package br.com.sonnya.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sonnya.model.Comercio;
import br.com.sonnya.service.ComercioService;
@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class ClienteController {

	
	@Autowired
	ComercioService comercioService;
	

	@RequestMapping(method = RequestMethod.POST,value="/comercios",
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Comercio> cadastrar(@RequestBody Comercio comercio) {
		
		
		return new ResponseEntity<Comercio>(comercioService.alterarSerie(comercio),HttpStatus.CREATED);
	}
	
	
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
	
	
	@RequestMapping(method = RequestMethod.DELETE,value="/comercios/{id}",	
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Comercio>> deletar(@PathVariable("id") String id) {
		Integer teset =Integer.valueOf(id) ;
		Collection<Comercio> seriesColec = comercioService.delete(teset); 
		return new ResponseEntity<>(seriesColec,HttpStatus.OK);
	}
	
	

	
	
}
