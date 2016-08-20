package br.com.system.StockLibrary.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.system.StockLibrary.model.Usuario;
import br.com.system.StockLibrary.service.UsuarioService;

@Named
@ViewScoped
public class UsuarioController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private UsuarioService usuarioService;
	
	@Inject
	private Usuario usuario;
	
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
