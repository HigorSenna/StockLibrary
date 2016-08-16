package br.com.system.StockLibrary.controller;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class ControllerTeste implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public String redirecionar(){
		return "template.xhtml?faces-redirect=true";
	}
}
