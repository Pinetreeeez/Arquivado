package retangulo;

import java.util.Scanner;

public class Retanmain {
	
	public static void main(String[] args) {
		
		int tempo = 0;
		
		while(true) {
		calcRetangulo retangulo = new calcRetangulo();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a largura do retângulo: ");
		retangulo.setlarguraRetangulo(scan.nextInt());
		
		System.out.println("Digite a altura do retângulo: ");
		retangulo.setalturaRetangulo(scan.nextInt());
		
		System.out.println("A área desse retangulo é: " + retangulo.areaRetangulo());
		
		tempo++;
		
		if (tempo >= 15) {
			System.out.println("15 áreas de retângulos calculadas! Fim!" + System.lineSeparator());
			break;
			}
		}
	}
}