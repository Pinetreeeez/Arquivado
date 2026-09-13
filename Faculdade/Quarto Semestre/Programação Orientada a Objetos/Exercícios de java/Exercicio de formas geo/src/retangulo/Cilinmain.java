package retangulo;

import java.util.Scanner;

public class Cilinmain {
	public static void main(String[] args) {
		int tempo = 0;
		
		while(true) {
		calcCilindro cilindro = new calcCilindro();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do cilindro: ");
		cilindro.setraioCilin(scan.nextFloat());
		
		System.out.println("Digite o valor da altura do cilindro: ");
		cilindro.setalturaCilin(scan.nextFloat());
		
		System.out.println("O volume desse cilindro é: " + cilindro.calcularvolumeCilin() + System.lineSeparator());
		
		tempo++;
		
		if (tempo >= 25) {
			System.out.println("25 volumes de cilindros calculados! Fim!" + System.lineSeparator());
			break;
			}
		}
	}
}
