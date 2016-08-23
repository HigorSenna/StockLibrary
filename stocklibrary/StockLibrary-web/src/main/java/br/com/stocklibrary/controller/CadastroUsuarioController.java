package br.com.stocklibrary.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.stocklibrary.enuns.TipoMensagemEnum;
import br.com.stocklibrary.service.UsuarioService;
import br.com.stocklibray.vm.CadastroUsuarioVM;
import br.com.system.StockLibrary.util.MessagesAndRedirect;


@Named
@ViewScoped
public class CadastroUsuarioController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroUsuarioVM cadastroUsuarioVM;
	
	@Inject
	private UsuarioService usuarioService;
	
	public void salvar(){
		
		try {
			usuarioService.salvar(cadastroUsuarioVM.getUsuario());
			MessagesAndRedirect.exibirMensagemRedirect("Usuário inserido com sucesso!!", "login.xhtml", TipoMensagemEnum.SUCESSO);
		} catch (Exception e) {
			MessagesAndRedirect.exibirMensagemRedirect("Falha ao inserir usuário", "login.xhtml", TipoMensagemEnum.ERRO);
			e.printStackTrace();
		}
	}

	public CadastroUsuarioVM getCadastroUsuarioVM() {
		return cadastroUsuarioVM;
	}

	public void setCadastroUsuarioVM(CadastroUsuarioVM cadastroUsuarioVM) {
		this.cadastroUsuarioVM = cadastroUsuarioVM;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
}
