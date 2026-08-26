package retangulo;

public class calcTrapézio {
	private float baseMaior;
	private float baseMenor;
	private float altura;
	private float area;
	
	float getbasemaiorTrapezio() {
		return this.baseMaior;
	}
	
	float getbasemenorTrapezio() {
		return this.baseMenor;
	}
	
	float getalturaTrapezio() {
		return this.altura;
	}
	
	void setbasemaiorTrapezio(float baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	void setbasemenorTrapezio(float baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	void setalturaTrapezio(float altura) {
		this.altura = altura;
	}
	
	float areaTrapezio() {
		area = (((getbasemaiorTrapezio() + getbasemenorTrapezio()) * getalturaTrapezio()) /2);
		return area;
	}
	
}

