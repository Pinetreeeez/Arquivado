package ex16;

public class Pessoa {
		private String nome_pessoa;
		private String cpf_pessoa;
		private int idade_pessoa;
		
		public Pessoa(String nome_pessoa, String cpf_pessoa, int idade_pessoa) {
			this.nome_pessoa = nome_pessoa;
			this.cpf_pessoa = cpf_pessoa;
			if (idade_pessoa > 0) {
				this.idade_pessoa = idade_pessoa;
			} else { System.out.println("ERRO - Idade inválida" + System.lineSeparator());
			return;}
		}
		
		String getNome_pessoa(){
			return this.nome_pessoa;
		}
		
		String getCpf_pessoa() {
			return this.cpf_pessoa;
		}
		
		int getIdade_pessoa() {
			return this.idade_pessoa;
		}
		
		void setNome_pessoa(String nome_pessoa) {
			this.nome_pessoa = nome_pessoa;
		}
		
		void setCpf_pessoa(String cpf_pessoa) {
			this.cpf_pessoa = cpf_pessoa;
		}
		
		void setIdade_pessoa(int idade_pessoa) {
			this.idade_pessoa = idade_pessoa; 
		}
		
		void ImprimirDados(){
			System.out.println("Dados da pessoa" + System.lineSeparator() + "Nome = " + nome_pessoa + System.lineSeparator() + "Cpf = " + cpf_pessoa + System.lineSeparator() + "Idade = " + idade_pessoa + System.lineSeparator());
		}
	}

