package ex23;

public class ItemBiblioteca {
	private int id;
	private String titulo;
	private int anoPublicacao;
	private boolean emprestado;
	
	public ItemBiblioteca(int id, String titulo, int anoPublicacao, boolean emprestado) {
		this.id=id;
		this.titulo=titulo;
		this.anoPublicacao = anoPublicacao;
		this.emprestado=emprestado;
	}
	
	int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	String getTitulo() {
		return this.titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	int getAnoPublicacao() {
		return this.anoPublicacao;
	}
	
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	boolean getEmprestado() {
		return emprestado;
	}
	
	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public boolean emprestar() {
		return emprestado = true;
	}
	
	public boolean devolver() {
		return emprestado = false;
	}
}
