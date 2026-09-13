package ex18;

public class Carro extends Veiculo{
	private int quantidadePortas;
	private boolean arCondicionadoLigado;
	
	public Carro(String marca, String modelo, int anoFabricacao, double velocidadeAtual, int quantidadePortas, boolean arCondicionadoLigado) {
		super(marca, modelo, anoFabricacao, velocidadeAtual);
		this.quantidadePortas = quantidadePortas;
		this.arCondicionadoLigado = arCondicionadoLigado;
	}
	
	int getQuantidadePortas(){
		return this.quantidadePortas;
	}
	
	boolean getarCondicionadoLigado() {
		return this.arCondicionadoLigado;
	}
	
	void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	void setarCondicionadoLigado(boolean arCondicionadoLigado) {
		this.arCondicionadoLigado = arCondicionadoLigado;
	}
	
	void ligarArCondicionado() {
		arCondicionadoLigado = true;
	}
	
	void desligarArCondicionado() {
		arCondicionadoLigado = false;
	}
}
