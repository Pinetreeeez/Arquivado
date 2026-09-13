package ex16;

public class Aluno extends Pessoa {
	
	private String ra_aluno;
	private String curso_aluno;
	private double nota1_aluno;
	private double nota2_aluno;
	
	public Aluno(String nome_pessoa, String cpf_pessoa, int idade_pessoa, String ra_aluno, String curso_aluno, double nota1_aluno, double nota2_aluno ) {
		super(nome_pessoa,cpf_pessoa,idade_pessoa);
		this.ra_aluno = ra_aluno;
		this.curso_aluno = curso_aluno;
		this.nota1_aluno = nota1_aluno;
		this.nota2_aluno = nota2_aluno;
	}
	
	String getRa_aluno() {
		return this.ra_aluno;
	}
	
	String getCurso_aluno() {
		return this.curso_aluno;
	}
	
	double getNota1_aluno() {
		return this.nota1_aluno;
	}
	
	double getNota2_aluno() {
		return this.nota2_aluno;
	}
	
	void setRa_aluno(String ra_aluno) {
		this.ra_aluno = ra_aluno;
	}
	
	void setCurso_aluno (String curso_aluno) {
		this.curso_aluno = curso_aluno;
	}
	
	void setNota1_aluno (double nota1_aluno) {
		this.nota1_aluno = nota1_aluno;
	}
	
	void setNota2_aluno (double nota2_aluno) {
		this.nota2_aluno = nota2_aluno;
	}
	
	double calcularMedia() {
		double resultado = (nota1_aluno + nota2_aluno) / 2;
		return resultado;
	}
}
