package br.com.sonnya.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sonnya.model.Usuario;
import br.com.sonnya.repository.UsuarioRepositorio;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepositorio usuarioRepositorio;

	public Usuario buscarSeriePorId(Integer id) {

		return usuarioRepositorio.findOne(id);
	}

	public List<Usuario> buscarTodasAsSeries() {

		return usuarioRepositorio.findAll();
	}

	public Usuario alterarSerie(Usuario usuario) {

		usuarioRepositorio.save(usuario);
		return usuario;
	}

	public Usuario novaSerie(Usuario usuario) {

		return usuarioRepositorio.save(usuario);
	}

	public Collection<Usuario> delete(Integer id) {
		usuarioRepositorio.delete(id);
		return usuarioRepositorio.findAll();
	}

}
