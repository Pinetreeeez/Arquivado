package ex23;

public class Livro extends ItemBiblioteca{
	private String autor;
	private String isbn;
	private int totalPaginas;
	
	public Livro(int id, String titulo, int anoPublicacao, boolean emprestado, String autor, String isbn, int totalPaginas) {
		super (id,titulo,anoPublicacao,emprestado);
		this.autor = autor;
		this.isbn = isbn;
		this.totalPaginas = totalPaginas;
	}
	
	String getAutor() {
		return this.autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	String getIsbn() {
		return this.isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	int getTotalPaginas() {
		return this.totalPaginas;
	}
	
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
	}
	
	public void exibirFichaCatalografica() {
		System.out.println("Id: " + getId());
		System.out.println("Titulo: " + getTitulo());
		System.out.println("Ano de Publicação: " + getAnoPublicacao());
		System.out.println("Emprestado: " + getEmprestado());
		System.out.println("Autor: " + getAutor());
		System.out.println("ISBN: " + getIsbn());
		System.out.println("Total de Páginas: " + getTotalPaginas() +System.lineSeparator());
	}
}
