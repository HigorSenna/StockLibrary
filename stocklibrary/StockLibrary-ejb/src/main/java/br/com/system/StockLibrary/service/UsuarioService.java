package br.com.system.StockLibrary.service;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.system.StockLibrary.model.Usuario;
import br.com.system.dao.UsuarioDAO;

@Stateless
public class UsuarioService implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioDAO usuarioDAO;
	
	public void salvar(Usuario usuario) throws Exception{
		usuarioDAO.salvar(usuario);
	}
}
