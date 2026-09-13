package ex18;

public class Veiculo {
	private String marca;
	private String modelo;
	private int anoFabricacao;
	protected double velocidadeAtual;
	
	public Veiculo(String marca, String modelo, int anoFabricacao, double velocidadeAtual) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.velocidadeAtual = velocidadeAtual;
	}
	
	String getMarca_veiculo(){
		return this.marca;
	}
	
	String getModelo_veiculo() {
		return this.modelo;
	}
	
	int getanoFabricacao() {
		return this.anoFabricacao;
	}
	
	double getvelocidadeAtual() {
		return this.velocidadeAtual;
	}
	
	void setMarca_veiculo(String marca) {
		this.marca = marca;
	}
	
	void setModelo_veiculo(String modelo) {
		this.modelo = modelo;
	}
	
	void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	void Acelerar_veiculo() {
		velocidadeAtual ++;
	}
	
	void Frear_veiculo() {
		if (velocidadeAtual > 0) {
			velocidadeAtual --;
		} else {
			velocidadeAtual = 0;
		}
	}
}
