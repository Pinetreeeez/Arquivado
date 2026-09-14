package ex26;

public class Notebook extends Dispositivo {
	private int memoriaRAM;
	private String processador;
	
	public Notebook(String fabricante, String modelo, boolean ligado, int nivelBateria, int memoriaRAM, String processador) {
		super (fabricante, modelo, ligado, nivelBateria);
		this.memoriaRAM = memoriaRAM;
		this.processador = processador;
	}
	
	int getMemoriaRAM() {
		return this.memoriaRAM;
	}
	
	public void setMemoriaRAM(int memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	
	String getProcessador() {
		return this.processador;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	public void executarProcessamentoPesado() {
		System.out.println("Executando processamento pesado!");
		setNivelBateria(getNivelBateria() - 10);
	}
}
