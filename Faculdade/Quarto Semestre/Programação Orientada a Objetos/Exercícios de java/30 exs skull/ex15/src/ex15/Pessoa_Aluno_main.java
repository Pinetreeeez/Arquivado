package ex15;

public class Pessoa_Aluno_main {

	public static void main(String[] args) {
		Pessoa novapessoa = new Pessoa("Ana Clara Silva", "123.456.789-00", 25);
		
		
		System.out.println("Nome: " + novapessoa.getNome_pessoa());
		System.out.println("Cpf: " + novapessoa.getCpf_pessoa());
		System.out.println("Idade: " + novapessoa.getIdade_pessoa() + System.lineSeparator());
		
		
		Aluno novoaluno = new Aluno("Ana Clara Silva", "123.456.789-00", 25, "RA2024001", "Engenharia de Software", 8.5, 9.0);
		
		System.out.println("Nome: " + novoaluno.getNome_pessoa());
		System.out.println("Cpf: " + novoaluno.getCpf_pessoa());
		System.out.println("Idade: " + novoaluno.getIdade_pessoa());
		System.out.println("Ra: "+ novoaluno.getRa_aluno());
		System.out.println("Curso: " + novoaluno.getCurso_aluno());
		System.out.println("Nota 1: " + novoaluno.getNota1_aluno());
		System.out.println("Nota 2: " + novoaluno.getNota2_aluno());
		System.out.println("Média: " + novoaluno.calcularMedia());
	}

}
