package ex25;

public class Enfermeiro extends ProfissionalSaude{
	private String coren;
	private String setor;
	
	public Enfermeiro(String nome, String matriculaHospitalar, String unidadeAtendimento, String coren, String setor) {
		super(nome,matriculaHospitalar,unidadeAtendimento);
		this.coren = coren;
		this.setor = setor;
	}
	
	String getCoren() {
		return this.coren;
	}
	
	public void setCoren(String coren) {
		this.coren = coren;
	}
	
	String getSetor() {
		return this.setor;
	}
	
	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	public void administrarMedicamento(String medicamento, String paciente, String via) {
		System.out.println("[MEDICAMENTO ADMINISTRADO]");
		System.out.println("Medicamento: " + medicamento);
		System.out.println("Paciente: " + paciente);
		System.out.println("Via: " + via);
	}
}
