package br.com.stocklibrary.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.stocklibrary.service.UsuarioService;
import br.com.stocklibray.vm.ConsultaUsuarioVM;

@Named
@ViewScoped
public class ConsultaUsuarioController implements Serializable{

	private static final long serialVersionUID = 1L;

	@Inject
	private ConsultaUsuarioVM consultaUsuarioVM;
	
	@Inject
	private UsuarioService usuarioService;
	
	@PostConstruct
	public void init(){
		buscarTodos();
	}
	
	private void buscarTodos(){
		try {
			consultaUsuarioVM.setUsuarios(usuarioService.buscarTodos());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ConsultaUsuarioVM getConsultaUsuarioVM() {
		return consultaUsuarioVM;
	}

	public void setConsultaUsuarioVM(ConsultaUsuarioVM consultaUsuarioVM) {
		this.consultaUsuarioVM = consultaUsuarioVM;
	}
}
