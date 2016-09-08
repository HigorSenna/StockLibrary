package br.com.stocklibrary.enums;

public enum TipoUsuarioEnum {
	
	C("Comum","C"),
	A("Administrador","A");
	
	private String label;
	private String valor;

	private TipoUsuarioEnum(String label, String valor) {
		this.label = label;
		this.valor = valor;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
