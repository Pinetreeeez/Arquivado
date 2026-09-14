package ex21;

public class Principal {

	public static void main(String[] args) {
		
		Professor professor = new Professor("1001", "Carlos Silva", "Mestre");

		ProfessorHorista professorhorista = new ProfessorHorista("1002", "Ana Souza", "Doutora", 20, 50.0);

		System.out.println("Registro: " + professor.getRegistroFuncional());

		System.out.println("Nome: " + professor.getNome());

		System.out.println("Titulação: " + professor.getTitulacao());

		System.out.println("Salário: R$ " + professor.calcularSalario());

		System.out.println("Registro: " + professorhorista.getRegistroFuncional()+ System.lineSeparator());
		
		
		System.out.println("Registro: " + professorhorista.getRegistroFuncional());
		
		System.out.println("Nome: " + professorhorista.getNome());

		System.out.println("Titulação: " + professorhorista.getTitulacao());

		System.out.println("Horas Semanais: " + professorhorista.getTotalHorasSemanais());

		System.out.println("Valor Hora/Aula: R$ " + professorhorista.getValorHoraAula());

		System.out.println("Salário: R$ " + professorhorista.calcularSalario());
		
	}

}
