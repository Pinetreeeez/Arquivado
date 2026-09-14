package ex25;

public class Principal {
	public static void main(String[] args) {
		Medico medico = new Medico("Dra. Helena Rios", "M-202", "Centro Cirúrgico", "Cardiologia", "CRM/SP 123456", 15);

		Enfermeiro enfermeiro = new Enfermeiro("Lucas Mendes", "E-303", "Pronto Socorro", "COREN/SP 654321", "Pediatria");

		System.out.println("Nome: " + medico.getNome());

		System.out.println("Matrícula: " + medico.getMatriculaHospitalar());

		System.out.println("Unidade: " + medico.getUnidadeAtendimento());

		System.out.println("Especialidade: " + medico.getEspecialidade());

		System.out.println("CRM: " + medico.getCrm());

		System.out.println("Cirurgias Realizadas: " + medico.getCirurgiasRealizadas()+ System.lineSeparator());

		medico.realizarCirurgia();

		System.out.println("Cirurgias após nova cirurgia: " + medico.getCirurgiasRealizadas()+ System.lineSeparator());

		medico.emitirLaudo("João Silva", "Paciente com quadro clínico estável."+ System.lineSeparator());

		System.out.println("Nome: " + enfermeiro.getNome());

		System.out.println("Matrícula: " + enfermeiro.getMatriculaHospitalar());

		System.out.println("Unidade: " + enfermeiro.getUnidadeAtendimento());

		System.out.println("COREN: " + enfermeiro.getCoren());

		System.out.println("Setor: " + enfermeiro.getSetor()+ System.lineSeparator());

		enfermeiro.administrarMedicamento("Dipirona", "Maria Oliveira", "Oral");
	}
}
