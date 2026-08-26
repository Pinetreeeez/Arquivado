package retangulo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int tempo = 0;
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a largura do retângulo: ");
		int larg = scan.nextInt();
		
		System.out.println("Digite a altura do retângulo: ");
		int altu = scan.nextInt();
		
		calcRetangulo retangulo = new calcRetangulo(larg,altu);
		
		System.out.println("A área desse retangulo é: " +retangulo.Area());
		
		tempo++;
		
		if (tempo >= 15) {
			System.out.println("15 áreas de retângulos calculadas! Fim!" + System.lineSeparator());
			break;
			}
		}
	}
}
