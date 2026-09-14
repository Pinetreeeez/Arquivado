package ex28;

public class Passagem {
	private String codigoBilhete;
	private String origem;
	private String destino;
	private double tarifaBase;
	
	public Passagem(String codigoBilhete, String origem, String destino, double tarifaBase) {
		this.codigoBilhete = codigoBilhete;
		this.origem = origem;
		this.destino = destino;
		this.tarifaBase = tarifaBase;
	}
	
	String getCodigoBilhete() {
		return this.codigoBilhete;
	}
	
	String getOrigem() {
		return this.origem;
	}
	
	String getDestino() {
		return this.destino;
	}
	
	double getTarifaBase() {
		return this.tarifaBase;
	}
	
	public void setCodigoBilhete(String codigoBilhete) {
		this.codigoBilhete = codigoBilhete;
	}
	
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	public void setTarifaBase(double tarifaBase) {
		this.tarifaBase = tarifaBase;
	}
	
	public double calcularValorTotal() {
		return this.tarifaBase;
	}
}
