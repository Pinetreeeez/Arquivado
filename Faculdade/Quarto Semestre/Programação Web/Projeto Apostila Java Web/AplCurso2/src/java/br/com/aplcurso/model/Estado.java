package br.com.aplcurso.model;

public class Estado {
	private int id;
	private String nomeEstado;
	private String siglaEstado;
	
	public Estado() {
		this.id = 0;
		this.nomeEstado = "";
		this.siglaEstado = "";
	}
	
	public Estado(int id, String nomeEstado, String siglaEstado) {
		this.id = id;
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getnomeEstado() {
		return nomeEstado;
	}
	
	public String getsiglaEstado() {
		return siglaEstado;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setnomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	
	public void setsiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}
}
