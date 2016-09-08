package br.com.stocklibray.vm;

import java.io.Serializable;
import java.util.List;

import br.com.stocklibrary.model.Usuario;


public class ConsultaUsuarioVM implements Serializable{

	private static final long serialVersionUID = 161105087230384956L;
	
	private List<Usuario> usuarios;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
