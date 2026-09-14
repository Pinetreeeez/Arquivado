package ex23;

public class Revista extends ItemBiblioteca {
	private int numeroEdicao;
	private String mesPublicacao;
	
	public Revista(int id, String titulo, int anoPublicacao, boolean emprestado, int numeroEdicao, String mesPublicacao) {
		super (id,titulo,anoPublicacao,emprestado);
		this.numeroEdicao = numeroEdicao;
		this.mesPublicacao = mesPublicacao;
	}
	
	int getNumeroEdicao() {
		return this.numeroEdicao;
	}
	
	public void setNumeroEdicao(int numeroEdicao) {
		this.numeroEdicao = numeroEdicao;
	}
	
	String getMesPublicacao() {
		return this.mesPublicacao;
	}
	
	public void setMesPublicacao(String mesPublicacao) {
		this.mesPublicacao = mesPublicacao;
	}
	
	public void exibirFichaCatalografica() {
		System.out.println("Mes de Publicação da Revista: " + getMesPublicacao());
		System.out.println("Numero de Edição da Revista: " + getNumeroEdicao());
	}
}
