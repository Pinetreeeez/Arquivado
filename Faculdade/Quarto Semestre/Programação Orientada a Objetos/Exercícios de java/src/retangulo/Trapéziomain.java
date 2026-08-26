package retangulo;

import java.util.Scanner;

public class Trapéziomain {

	public static void main(String[] args) {
		int tempo = 0;
		
		while(true) {
		calcTrapézio trapezio = new calcTrapézio();
		
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
			System.out.println("15 áreas de retângulos calculadas! Fim!" + System.lineSeparator());
			break;
			}
		}
	}
}
