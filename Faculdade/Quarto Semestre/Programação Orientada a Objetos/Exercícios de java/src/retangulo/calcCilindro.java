package retangulo;

public class calcCilindro {
	private float raio;
	private float altura;
	private double volume;
	
	float getraioCilin() {
		return this.raio;
	}
	
	float getalturaCilin() {
		return this.altura;
	}
	
	void setraioCilin(float raio) {
		this.raio = raio;
	}
	
	void setalturaCilin(float altura) {
		this.altura = altura;
	}
	
	double calcularvolumeCilin() {
		volume = Math.PI * (getraioCilin() * getraioCilin()) * getalturaCilin();
		return volume;
	}
}
