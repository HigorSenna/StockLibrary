package br.com.stocklibrary.controller;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.stocklibrary.enuns.TipoMensagemEnum;
import br.com.stocklibrary.model.Usuario;
import br.com.stocklibrary.service.UsuarioService;
import br.com.stocklibray.vm.LoginVM;
import br.com.system.StockLibrary.util.MessagesAndRedirect;
import br.com.system.StockLibrary.util.SessionUtils;

@Named
@ViewScoped
public class LoginController implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject
	UsuarioService usuarioService;	
	
	@Inject
	private LoginVM loginVM;
	
	@PostConstruct
	public void init(){
		System.out.println("asas");
	}
	
	public void logar(){
		Usuario usuarioRetornado = usuarioService.buscarUsuario(loginVM.getUsuario());
		abrirSessaoUsuario(usuarioRetornado);
	}
	public void validarSessao(){
		if(SessionUtils.existeSessao("usuario")){
			Usuario usuarioSessao = (Usuario) SessionUtils.pegarSessao("usuario");
			validarTipoUsuario(usuarioSessao);
		}else{
			MessagesAndRedirect.exibirMensagemGlobalRedirect("Você não está logado!!", "/StockLibrary-web/", TipoMensagemEnum.ERRO);
//			MessagesAndRedirect.exibirMensagemRedirect("Você não está logado!!", "/StockLibrary-web/", TipoMensagemEnum.ERRO);
		}
	}
	
	private void abrirSessaoUsuario(Usuario usuario){
		if(usuario != null){
			SessionUtils.criarSessao("usuario", usuario);
			validarTipoUsuario(usuario);
		}
		else{
			MessagesAndRedirect.exibirMensagemRedirect("Usuario nao encontrado!!", "/StockLibrary-web/", TipoMensagemEnum.ERRO);
		}
	}
	
	private void validarTipoUsuario(Usuario usuario){
		if(usuario.getTipo().equals("C")){
			MessagesAndRedirect.redirecionarPara("wwww.google.com.br");
		}
		else{
			MessagesAndRedirect.redirecionarPara("/StockLibrary-web/pages/principal/home.xhtml");
		}
	}

	public LoginVM getLoginVM() {
		return loginVM;
	}

	public void setLoginVM(LoginVM loginVM) {
		this.loginVM = loginVM;
	}
}
