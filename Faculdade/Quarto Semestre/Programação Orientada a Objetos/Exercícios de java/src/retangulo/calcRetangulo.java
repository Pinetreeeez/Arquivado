package retangulo;

public class calcRetangulo {
	
	private float largura;
	private float altura;
	private float area;
	
	float getlarguraRetangulo() {
		return this.largura;
	}
	
	float getAlturaretangulo() {
		return this.altura;
	}
	
	float areaRetangulo() {
		area = getlarguraRetangulo() * getAlturaretangulo();
		return area;
	}
	
	void setlarguraRetangulo(float largura) {
		this.largura = largura;
	}
	
	void setalturaRetangulo(float altura) {
		this.altura = altura;
	}
}
