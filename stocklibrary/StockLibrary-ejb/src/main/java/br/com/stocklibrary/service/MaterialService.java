package br.com.stocklibrary.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.stocklibrary.dao.MaterialDAO;
import br.com.stocklibrary.model.Material;

@Stateless
public class MaterialService implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Inject
	private MaterialDAO materialDAO;
	
	@Transactional
	public void excluir(Material material) throws Exception{
		materialDAO.deletar(material);
	}
	
	public void salvar(Material material) throws Exception{
		materialDAO.salvar(material);
	}
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public List<Material> buscarTodos() throws Exception{
		return materialDAO.buscarTodos();
	}
	
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public Material buscar(Long id) throws Exception{
		return materialDAO.buscarPor(id);
	}
}
