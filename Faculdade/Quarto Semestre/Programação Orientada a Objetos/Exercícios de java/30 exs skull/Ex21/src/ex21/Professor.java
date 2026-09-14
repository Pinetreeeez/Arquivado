package ex21;

public class Professor {
	private String registroFuncional;
	private String nome;
	private String titulacao;
	
	public Professor(String registroFunciona,String nome, String titulacao){
		this.registroFuncional =registroFunciona;
		this.nome = nome;
		this.titulacao = titulacao;
	}
	
	String getRegistroFuncional() {
		return this.registroFuncional;
	}
	
	String getNome() {
		return this.nome;
	}
	
	String getTitulacao() {
		return this.titulacao;
	}
	
	public void setRegistroFuncional(String registroFuncional) {
		this.registroFuncional = registroFuncional;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public double calcularSalario() {
		return 3500;
	}
}
