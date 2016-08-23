package br.com.stocklibrary.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import br.com.stocklibrary.enuns.TipoMensagemEnum;
import br.com.stocklibrary.model.Material;
import br.com.stocklibrary.service.MaterialService;
import br.com.stocklibray.vm.ConsultaMaterialVM;
import br.com.system.StockLibrary.util.MessagesAndRedirect;

@Named
@ViewScoped
public class ConsultaMaterialController implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ConsultaMaterialVM consultaMaterialVM;
	
	@Inject
	private MaterialService materialService;
	
	@PostConstruct
	public void init(){
		buscarTodos();		
		buscar();
	}
	
	public void modoVizualizacao(){
		consultaMaterialVM.setVisualizacao(true);
	}
	
	public void buscar(){
		try {
			String visualizacao = (String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("visualizacao");
			if(visualizacao != null && visualizacao.equals("true")){
				String id = (String) FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");				
				Material material = materialService.buscar(Long.parseLong(id));
				consultaMaterialVM.setMaterial(material);
			}
			
		} catch (Exception e) {
			MessagesAndRedirect.exibirMensagemRedirect("Ocorreu um erro", "/StockLibrary-web/pages/principal/home.xhtml", TipoMensagemEnum.ERRO);
		}
	}
	
	public void buscarTodos(){
		try {
			List<Material> materiais =  materialService.buscarTodos();
			consultaMaterialVM.setMateriais(materiais);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ConsultaMaterialVM getConsultaMaterialVM() {
		return consultaMaterialVM;
	}

	public void setConsultaMaterialVM(ConsultaMaterialVM consultaMaterialVM) {
		this.consultaMaterialVM = consultaMaterialVM;
	}

	public MaterialService getMaterialService() {
		return materialService;
	}

	public void setMaterialService(MaterialService materialService) {
		this.materialService = materialService;
	}
}
