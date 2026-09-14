package ex24;

public class Retangulo extends FiguraGeometrica{
	private double largura;
	private double altura;
	
	public Retangulo(String cor, boolean preenchido, double largura, double altura) {
		super(cor, preenchido);
		this.largura = largura;
		this.altura = altura;
	}
	
	double getLargura() {
		return this.largura;
	}
	
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		return largura * altura;
	}
	
	@Override
	public double calcularPerimetro() {
		return 2 * (largura + altura);
	}
}
