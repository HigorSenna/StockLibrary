package br.com.system.StockLibrary.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.omnifaces.util.Messages;

import br.com.stocklibrary.enuns.TipoMensagemEnum;

public class MessagesAndRedirect {
	
	private static void manterMensagemAoRedirecionar(){
		FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);		
	}
	
	public static void exibirMensagemGlobalRedirect(String msg,String paginaRedirecionar,TipoMensagemEnum tipoMensagem){
		
		if(tipoMensagem.getValor().equals("S")){
			Messages.addFlashGlobalInfo(msg);
		}
		else if(tipoMensagem.getValor().equals("E")){
			Messages.addFlashGlobalError(msg);	
		}
		else{
			Messages.addFlashGlobalWarn(msg);
		}
		
		redirecionarPara(paginaRedirecionar);
	}
	
	public static void exibirMensagemRedirect(String msg,String paginaRedirecionar,TipoMensagemEnum tipoMensagem){
		FacesMessage formatoMensagem;
		
		if(tipoMensagem.getValor().equals("S")){
			formatoMensagem = new FacesMessage(FacesMessage.SEVERITY_INFO,msg,"");	
		}
		else if(tipoMensagem.getValor().equals("E")){
			formatoMensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR,msg,"");		
		}
		else{
			formatoMensagem = new FacesMessage(FacesMessage.SEVERITY_WARN,msg,"");
		}
			
		manterMensagemAoRedirecionar();
		FacesContext.getCurrentInstance().addMessage(null,formatoMensagem);
		redirecionarPara(paginaRedirecionar);
	}
	
	public static void redirecionarPara(String pagina){
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect(pagina);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}