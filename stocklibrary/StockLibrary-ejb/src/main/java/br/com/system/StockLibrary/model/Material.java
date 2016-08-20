package br.com.system.StockLibrary.model;

import java.io.Serializable;
import java.util.Date;

public class Material implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String titulo;
	private String categoria;
	private String texto;
	private Byte[] arquivo;
	private Date dataPublicacao;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Byte[] getArquivo() {
		return arquivo;
	}
	public void setArquivo(Byte[] arquivo) {
		this.arquivo = arquivo;
	}
	public Date getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}			
}
