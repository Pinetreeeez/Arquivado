package retangulo;

public class calcRetangulo {
	
	private int largura;
	private int altura;
	
	calcRetangulo(int largura, int altura){
		this.largura = largura;
		this.altura = altura;
	}
	
	int getLargura() {
		return this.largura;
	}
	
	int getAltura() {
		return this.altura;
	}
	
	int Area() {
		return getLargura() * getAltura();
	}
	
	void setLargura(int largura) {
		this.largura = largura;
	}
	
	void setAltura(int altura) {
		this.altura = altura;
	}
}
