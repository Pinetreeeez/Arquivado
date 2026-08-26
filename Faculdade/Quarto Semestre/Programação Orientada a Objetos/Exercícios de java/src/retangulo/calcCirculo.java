package retangulo;

public class calcCirculo {
	
	private float raio;
	private double area;
	
	float getraioCirculo(){
		return this.raio;
	}
	
	void setraioCirculo(float raio) {
		this.raio = raio;
	}
	
	double areaCirculo() {
		area = Math.PI * (getraioCirculo() * getraioCirculo());
		return area;
	}
}
 
 