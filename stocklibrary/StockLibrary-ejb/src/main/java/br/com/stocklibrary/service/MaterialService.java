package br.com.stocklibrary.service;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.stocklibrary.dao.MaterialDAO;
import br.com.stocklibrary.model.Material;

@Stateless
public class MaterialService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private MaterialDAO materialDAO;
	
	public void salvar(Material material) throws Exception{
		materialDAO.salvar(material);
	}
}
