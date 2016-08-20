package br.com.stocklibrary.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.stocklibrary.service.MaterialService;
import br.com.stocklibray.vm.CadastroMaterialVM;

@Named
@ViewScoped
public class CadastroMaterialController implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private CadastroMaterialVM cadastroMaterialVM;
	
	@Inject
	private MaterialService materialService;
	
	public void salvar(){
		try {
			materialService.salvar(cadastroMaterialVM.getMaterial());
		} catch (Exception e) {
			System.out.println("nao salvou material");
		}
	}

	public CadastroMaterialVM getCadastroMaterialVM() {
		return cadastroMaterialVM;
	}

	public void setCadastroMaterialVM(CadastroMaterialVM cadastroMaterialVM) {
		this.cadastroMaterialVM = cadastroMaterialVM;
	}
}
