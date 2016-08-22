package br.com.stocklibray.vm;

import java.io.Serializable;

import javax.inject.Inject;

import br.com.stocklibrary.model.Material;

public class CadastroMaterialVM implements Serializable{
	private static final long serialVersionUID = 1L;

	@Inject
	private Material material;
	

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
}
