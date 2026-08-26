package retangulo;

public class calcCirculo {
	
	private int raio;
	
	calcCirculo(int raio){
		this.raio = raio;
	}
	
	int getRaio(){
		return this.raio;
	}
	
	double areairc() {
		return Math.PI * (raio * raio);
	}
}
 