package br.com.stocklibrary.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.stocklibrary.model.Usuario;
import br.com.stocklibrary.service.UsuarioService;


@Named
@ViewScoped
public class UsuarioController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private Usuario usuario;
	
	@Inject
	private UsuarioService usuarioService;
	
	public void salvar(){
		
		try {
			usuarioService.salvar(getUsuario());
			System.out.println("salvou!!");
		} catch (Exception e) {
			System.out.println("Falha ao salvar");
			e.printStackTrace();
		}
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
