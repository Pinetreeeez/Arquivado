package ex26;

public class Dispositivo {
	private String fabricante;
	private String modelo;
	private boolean ligado;
	private int nivelBateria;
	
	
	public Dispositivo (String fabricante, String modelo, boolean ligado, int nivelBateria) {
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ligado = ligado;
		if(nivelBateria < 0) {
			this.nivelBateria = 0;
		}
		else if(nivelBateria > 100) {
			this.nivelBateria = 100;
		}
		else {
			this.nivelBateria = nivelBateria;
		}
	}
	
	String getFrabricante() {
		return this.fabricante;
	}
	
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	boolean getLigado() {
		return this.ligado;
	}
	
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	int getNivelBateria() {
		return this.nivelBateria;
	}
	
	public void setNivelBateria(int nivelBateria) {
		this.nivelBateria = nivelBateria;
	}
	
	public void Ligar() {
		if (ligado == false) {
			setLigado(ligado = true);
			System.out.println("O dispositivo foi ligado");
		}
		else{
			System.out.println("O dispositivo ja esta ligado!");
		}
	}
	
	public void Desligar() {
		if (ligado == true) {
			setLigado(ligado = false);
			System.out.println("O dispositivo foi desligado");
		}
		
		else{
			System.out.println("O dispositivo ja esta desligado!");
		}
	}
	
	public void carregarBateria(int percentual) {
		if(percentual <= 0) {
			System.out.println("Percentual de carga inválido");
		}
		
		this.nivelBateria += percentual;
		
		if(this.nivelBateria > 100) {
			this.nivelBateria = 100;
		}
		
		System.out.println("A bateria foi carregada! Nivel atual: " + this.nivelBateria);
	}
}	
