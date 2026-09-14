package ex26;

public class Smartphone extends Dispositivo {
	private String operadora;
	private int armazenamentoGB;
	
	public Smartphone(String fabricante, String modelo, boolean ligado, int nivelBateria, String operadora, int armazenamentoGB) {
		super (fabricante, modelo, ligado, nivelBateria);
		this.operadora = operadora;
		this.armazenamentoGB = armazenamentoGB;
	}
	
	String getOperadora() {
		return this.operadora;
	}
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	int getArmazenamentoGB() {
		return this.armazenamentoGB;
	}
	
	public void setArmazenamentoGB(int armazenamentoGB) {
		this.armazenamentoGB = armazenamentoGB;
	}
	
	public void fazerLigacao(String contato) {
		System.out.println("Fez uma ligação para: " + contato);
		setNivelBateria(getNivelBateria() - 1);
	}
}
