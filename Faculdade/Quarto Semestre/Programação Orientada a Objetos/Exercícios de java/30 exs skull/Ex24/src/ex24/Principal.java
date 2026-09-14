package ex24;

public class Principal {
	public static void main(String[] args) {

		Retangulo retangulo = new Retangulo("Vermelho", false, 5.0, 3.0);

		Circulo circulo = new Circulo("Verde", true, 4.0);

		System.out.println("Cor: " + retangulo.getCor());

		System.out.println("Preenchido: " + retangulo.getPreenchido());

		System.out.println("Largura: " + retangulo.getLargura());

		System.out.println("Altura: " + retangulo.getAltura());

		System.out.println("Área: " + retangulo.calcularArea());

		System.out.println("Perímetro: " + retangulo.calcularPerimetro()+ System.lineSeparator());


		System.out.println("Cor: " + circulo.getCor());

		System.out.println("Preenchido: " + circulo.getPreenchido());

		System.out.println("Raio: " + circulo.getRaio());

		System.out.println("Área: " + circulo.calcularArea());

		System.out.println("Perímetro: " + circulo.calcularPerimetro()+ System.lineSeparator());
	}
}
