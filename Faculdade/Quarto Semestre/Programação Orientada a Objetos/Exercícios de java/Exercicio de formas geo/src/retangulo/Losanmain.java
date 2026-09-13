package retangulo;

import java.util.Scanner;

public class Losanmain {

	public static void main(String[] args) {
		int tempo = 0;
		
		while(true) {
		calcLosango losango = new calcLosango();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da diagonal maior do losângo: ");
		losango.setdiagmaiorLosan(scan.nextFloat());
		
		System.out.println("Digite o valor da diagonal menor do losângo: ");
		losango.setdiagmenorLosan(scan.nextFloat());
		
		System.out.println("A área desse losângo é: " + losango.calclosanArea() + System.lineSeparator());
		
		tempo++;
		
		if (tempo >= 25) {
			System.out.println("18 áreas de losângos calculados! Fim!" + System.lineSeparator());
			break;
			}
		}

	}

}
