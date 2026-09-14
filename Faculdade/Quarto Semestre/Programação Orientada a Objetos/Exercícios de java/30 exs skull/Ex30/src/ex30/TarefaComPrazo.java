package ex30;

public class TarefaComPrazo extends Tarefa{
	private String dataLimite;
	private int diasRestantes;
	
	public TarefaComPrazo(int id, String titulo, String descricao, boolean concluida, String dataLimite, int diasRestantes) {
		super(id, titulo, descricao, concluida);
		this.dataLimite = dataLimite;
		this.diasRestantes = diasRestantes;
	}
	
	String getDataLimite() {
		return this.dataLimite;
	}
	
	public void setDataLimite(String dataLimite) {
		this.dataLimite = dataLimite;
	}
	
	int getDiasRestantes() {
		return this.diasRestantes;
	}
	
	public void setDiasRestantes(int diasRestantes) {
		this.diasRestantes = diasRestantes;
	}
	
	boolean verificarSeEstaAtrasada() {
		return this.diasRestantes < 0;
	}
	
	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Data Limite: " + this.dataLimite);
		System.out.println("Dias Restantes: " + this.diasRestantes);
		
		if (verificarSeEstaAtrasada()) {
			System.out.println("ALERTA: Esta tarefa está ATRASADA!");
		}
	}
}
