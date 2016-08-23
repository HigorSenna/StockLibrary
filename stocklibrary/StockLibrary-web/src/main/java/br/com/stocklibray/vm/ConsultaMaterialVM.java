package br.com.stocklibray.vm;

import java.io.Serializable;
import java.util.List;

import br.com.stocklibrary.model.Material;

public class ConsultaMaterialVM implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Material material;
	
	private List<Material> materiais;
	
	private boolean visualizacao = true;

	public List<Material> getMateriais() {
		return materiais;
	}

	public void setMateriais(List<Material> materiais) {
		this.materiais = materiais;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public boolean isVisualizacao() {
		return visualizacao;
	}

	public void setVisualizacao(boolean visualizacao) {
		this.visualizacao = visualizacao;
	}
}
