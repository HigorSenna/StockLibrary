package br.com.stocklibrary.dao;

import javax.persistence.NoResultException;

import br.com.commons.ejb.dao.GenericoDAO;
import br.com.stocklibrary.model.Usuario;

public class UsuarioDAO extends GenericoDAO<Usuario, Long>{
	
	private static final long serialVersionUID = 1L;
	
	public Usuario buscar(Usuario user){
	
		try {
			Usuario usuario = (Usuario) getEntityManager()
				.createNamedQuery("Usuario.buscarLoginSenha",Usuario.class)
				.setParameter("l", user.getLogin())
				.setParameter("s", user.getSenha())
				.getSingleResult();
			
			return usuario;
		} catch (NoResultException e) {
			return null;
		}
		
	}
}
