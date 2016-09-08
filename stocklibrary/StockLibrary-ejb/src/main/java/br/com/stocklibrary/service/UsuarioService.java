package br.com.stocklibrary.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.stocklibrary.dao.UsuarioDAO;
import br.com.stocklibrary.model.Usuario;

@Stateless
public class UsuarioService implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	public void salvar(Usuario usuario) throws Exception{
		usuarioDAO.salvar(usuario);
	}
	
	public Usuario buscarUsuario(Usuario usuario){
		return usuarioDAO.buscar(usuario);
	}
	
	public List<Usuario> buscarTodos() throws Exception{
		return usuarioDAO.buscarTodos();
	}
}
