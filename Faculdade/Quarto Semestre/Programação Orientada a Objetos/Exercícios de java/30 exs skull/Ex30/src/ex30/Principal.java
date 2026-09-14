package ex30;

public class Principal {

	public static void main(String[] args) {
		TarefaSimples tarefaSimples = new TarefaSimples(101, "Comprar pão", "Ir à padaria pela manhã", false, 3);

		TarefaComPrazo tarefaComPrazo = new TarefaComPrazo(102, "Entregar relatório", "Fechamento financeiro", false, "15/10/2026", -2);

		System.out.println("=== TAREFA SIMPLES ===");
		tarefaSimples.marcarComoConcluida();
		tarefaSimples.exibirDetalhes();
		
		System.out.println();
		
		System.out.println("=== TAREFA COM PRAZO ===");
		tarefaComPrazo.exibirDetalhes();
		
	}

}
