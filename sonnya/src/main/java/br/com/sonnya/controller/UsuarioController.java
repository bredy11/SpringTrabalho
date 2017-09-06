package br.com.sonnya.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sonnya.model.Usuario;
import br.com.sonnya.service.UsuarioService;

@CrossOrigin
@RestController
public class UsuarioController {

	
	@Autowired
	UsuarioService usuarioService;
	
	
	@RequestMapping(method = RequestMethod.POST,value="/usuario",
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario usuario) {
		
		
		return new ResponseEntity<Usuario>(usuarioService.alterarSerie(usuario),HttpStatus.CREATED);
	}
	

	@RequestMapping(method = RequestMethod.GET,value="/usuario",	
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Usuario>> BuscarTodos() {
		HttpHeaders headers = new HttpHeaders();
	    headers.add("Access-Control-Allow-Origin", "http://localhost:3001");
		Collection<Usuario> seriesColec = usuarioService.buscarTodasAsSeries(); 
		return new ResponseEntity<>(seriesColec,headers,HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/usuario",	
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Usuario> alterar(@RequestBody Usuario usuario) {
	
		Usuario usuarioSalvo = usuarioService.alterarSerie(usuario); 
		return new ResponseEntity<>(usuarioSalvo,HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.DELETE,value="/usuario/{id}",	
			produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Usuario>> deletar(@PathVariable("id") String id) {
		Integer teset =Integer.valueOf(id) ;
		Collection<Usuario> seriesColec = usuarioService.delete(teset); 
		return new ResponseEntity<>(seriesColec,HttpStatus.OK);
	}
	
	

	
	
}
