package br.com.stocklibrary.validator;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import org.apache.commons.lang3.StringUtils;

import br.com.stocklibrary.enuns.TipoMensagemEnum;
import br.com.system.StockLibrary.util.MessagesAndRedirect;

@FacesValidator
public class BlankValidator implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		String valorObjeto = value.toString().replace(" ", "").trim();
		if(valorObjeto.equals("")){
			MessagesAndRedirect.exibirMensagemRedirect(montarMensagem(component), "cadastro.xhtml", TipoMensagemEnum.ERRO);
		}
	}
	
	private String montarMensagem(UIComponent componente){
		String nomeCampo = StringUtils.capitalize(componente.getClientId());
		
		return nomeCampo + ": Erro de validação: o valor é necessário";
	}
}
