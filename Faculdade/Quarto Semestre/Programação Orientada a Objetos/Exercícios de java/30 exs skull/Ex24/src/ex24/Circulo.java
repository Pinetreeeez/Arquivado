package ex24;

public class Circulo extends FiguraGeometrica {
	private double raio;
	
	public Circulo(String cor, boolean preenchido, double raio) {
		super (cor, preenchido);
		this.raio = raio;
	}
	
	double getRaio() {
		return this.raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}
	
	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * raio;
	}
}
