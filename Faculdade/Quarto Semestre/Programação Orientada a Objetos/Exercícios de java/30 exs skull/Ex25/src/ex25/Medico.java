package ex25;

public class Medico extends ProfissionalSaude {
	private String especialidade;
	private String crm;
	private int cirurgiasRealizadas;
	
	public Medico(String nome, String matriculaHospitalar, String unidadeAtendimento, String especialidade, String crm, int cirurgiasRealizadas) {
		super(nome,matriculaHospitalar,unidadeAtendimento);
		this.especialidade = especialidade;
		this.crm = crm;
		this.cirurgiasRealizadas = cirurgiasRealizadas;
	}
	
	String getEspecialidade() {
		return this.especialidade;
	}
	
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	String getCrm() {
		return this.crm;
	}
	
	public void setCrm(String crm) {
		this.crm =crm;
	}
	
	int getCirurgiasRealizadas() {
		return this.cirurgiasRealizadas;
	}
	
	public void setCirurgiasRealizadas(int cirurgiasRealizadas) {
		this.cirurgiasRealizadas = cirurgiasRealizadas;
	}
	
	public void realizarCirurgia() {
		cirurgiasRealizadas += 1;
	}
	
	public void emitirLaudo(String paciente, String parecerClinico) {
		System.out.println("[LAUDO]");
		System.out.println("Paciente: " + paciente);
		System.out.println("Medico: " +parecerClinico);
	}
}
