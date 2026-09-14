package ex30;

public class TarefaSimples extends Tarefa {
	private int nivelPrioridade;
	
	public TarefaSimples(int id, String titulo, String descricao, boolean concluida, int nivelPrioridade) {
		super(id, titulo, descricao, concluida);
		if (nivelPrioridade < 1) this.nivelPrioridade = 1;
		else if (nivelPrioridade > 5) this.nivelPrioridade = 5;
		else this.nivelPrioridade = nivelPrioridade;
	}
	
	int getNivelPrioridade() {
		return this.nivelPrioridade;
	}
	
	public void setNivelPrioridade(int nivelPrioridade) {
		this.nivelPrioridade = nivelPrioridade;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Nível de Prioridade: " + this.nivelPrioridade);
	}
}
