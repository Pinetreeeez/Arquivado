package ex23;

public class Principal {
	public static void main(String[] args) {
		ItemBiblioteca item = new ItemBiblioteca(1, "Dom Casmurro", 1899, false);

		Livro livro = new Livro(2, "O Senhor dos Anéis", 1954, false, "J.R.R. Tolkien", "978-3-16-148410-0", 1200);

		Revista revista = new Revista(3, "Superinteressante", 2023, false, 450, "Outubro");

		System.out.println("ID: " + item.getId());

		System.out.println("Título: " + item.getTitulo());

		System.out.println("Ano: " + item.getAnoPublicacao());

		System.out.println("Emprestado: " + item.getEmprestado());

		item.emprestar();

		System.out.println("Emprestado após emprestar: " + item.getEmprestado()+System.lineSeparator());

		livro.exibirFichaCatalografica();

		revista.exibirFichaCatalografica();
	}
}
