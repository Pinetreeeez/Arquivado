package ex24;

public class FiguraGeometrica {
	private String cor;
	private boolean preenchido;
	
	public FiguraGeometrica(String cor, boolean preenchido) {
		this.cor = cor;
		this.preenchido = preenchido;
	}
	
	String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	boolean getPreenchido() {
		return this.preenchido;
	}
	
	public void setPreenchido(boolean preenchido) {
		this.preenchido = preenchido;
	}
	
	public double  calcularPerimetro() {
		return 0.0;
	}
	
	public double calcularArea() {
		return 0.0;
	}
}
