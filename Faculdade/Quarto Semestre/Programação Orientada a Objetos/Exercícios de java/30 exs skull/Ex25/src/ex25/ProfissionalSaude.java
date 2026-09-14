package ex25;

public class ProfissionalSaude {
	private String nome;
	private String matriculaHospitalar;
	private String unidadeAtendimento;
	
	public ProfissionalSaude(String nome, String matriculaHospitalar, String unidadeAtendimento) {
		this.nome = nome;
		this.matriculaHospitalar = matriculaHospitalar;
		this.unidadeAtendimento = unidadeAtendimento;
	}
	
	String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	String getMatriculaHospitalar() {
		return this.matriculaHospitalar;
	}
	
	public void setMatriculaHospitalar(String matriculaHospitalar) {
		this.matriculaHospitalar = matriculaHospitalar;
	}
	
	String getUnidadeAtendimento() {
		return this.unidadeAtendimento;
	}
	
	public void setUnidadeAtendimento(String unidadeAtendimento) {
		this.unidadeAtendimento = unidadeAtendimento;
	}
	
	public int realizarPlantao(int horasPlantao) {
		return horasPlantao;
	}
}
