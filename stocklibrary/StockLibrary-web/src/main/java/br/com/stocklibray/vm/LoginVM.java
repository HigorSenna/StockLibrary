package br.com.stocklibray.vm;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.stocklibrary.model.Usuario;

public class LoginVM implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	Usuario usuario;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
