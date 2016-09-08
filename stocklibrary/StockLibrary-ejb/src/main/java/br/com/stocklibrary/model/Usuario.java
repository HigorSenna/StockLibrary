package br.com.stocklibrary.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import br.com.stocklibrary.enums.TipoUsuarioEnum;

@NamedQuery(name="Usuario.buscarLoginSenha", 
query="select u from Usuario u where u.login =:l and u.senha =:s")

@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUsuario")
	private Long id;
	
	@Column(name="login")
	private String login;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name = "tipo")
	private String tipo = TipoUsuarioEnum.C.getValor();
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLogin() {		
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		if(tipo !=null && tipo.equals("true")){
			this.tipo = TipoUsuarioEnum.A.getValor();
		}
		else{
			this.tipo = TipoUsuarioEnum.C.getValor();
		}
	}
	
	public String getTipoLabel(){
		if(tipo.equals("C")){
			return TipoUsuarioEnum.C.getLabel();
		}
		return TipoUsuarioEnum.A.getLabel();
	}
}
