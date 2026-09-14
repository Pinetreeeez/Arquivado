package ex30;

public class Tarefa {
	protected int id;
	protected String titulo;
	protected String descricao;
	protected boolean concluida;
	
	public Tarefa(int id, String titulo, String descricao, boolean concluida) {
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = concluida;
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
	
	String getDescricao() {
		return this.descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	boolean isConcluida() {
		return this.concluida;
	}
	
	public void marcarComoConcluida() {
		this.concluida = true;
	}
	
	public void reabrirTarefa() {
		this.concluida = false;
	}
	
	public void exibirDetalhes() {
		System.out.println("ID: " + this.id);
		System.out.println("Título: " + this.titulo);
		System.out.println("Descrição: " + this.descricao);
		System.out.println("Concluída: " + this.concluida);
	}
}
