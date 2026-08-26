package retangulo;

import java.util.Scanner;
import java.util.Vector;

public class circmain {

	public static void main(String[] args) {
		Vector<Double> historico = new Vector<Double>();
		
		int tempo = 0;
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o raio do circulo: ");
		int raiocirc = scan.nextInt();
		
		calcCirculo circulo = new calcCirculo(raiocirc);
		
		System.out.println("A área desse circulo é: " + circulo.areairc() + System.lineSeparator());
		historico.add(circulo.areairc());
		
		System.out.println("Adicionado no histórico: "+ historico + System.lineSeparator());
		
		tempo++;
		
		if (tempo >= 10) {
			System.out.println("10 áreas calculadas! Fim!" + System.lineSeparator());
			break;
			}
		}
	}
}
