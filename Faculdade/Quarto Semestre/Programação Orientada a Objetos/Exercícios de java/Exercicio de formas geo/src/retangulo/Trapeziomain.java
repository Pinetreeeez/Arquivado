package retangulo;

import java.util.Scanner;

public class Trapeziomain {

	public static void main(String[] args) {
		int tempo = 0;
		
		while(true) {
		calcTrapezio trapezio = new calcTrapezio();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o valor da base maior do trapézio: ");
		trapezio.setbasemaiorTrapezio(scan.nextFloat());
		
		System.out.println("Digite o valor da base menor do trapézio: ");
		trapezio.setbasemenorTrapezio(scan.nextFloat());
		
		System.out.println("Digite o valor da altura do trapézio: ");
		trapezio.setalturaTrapezio(scan.nextFloat());
		
		System.out.println("A área desse trapézio é: " + trapezio.areaTrapezio() + System.lineSeparator());
		
		tempo++;
		
		if (tempo >= 12) {
			System.out.println("12 áreas de trapézios calculadas! Fim!" + System.lineSeparator());
			break;
			}
		}
	}
}