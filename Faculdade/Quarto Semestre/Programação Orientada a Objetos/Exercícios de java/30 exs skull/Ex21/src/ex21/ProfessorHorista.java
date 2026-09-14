package ex21;

public class ProfessorHorista extends Professor{
	private int totalHorasSemanais;
	private double valorHoraAula;
	
	public ProfessorHorista(String registroFunciona,String nome, String titulacao, int totalHorasSemanais, double valorHoraAula) {
		super (registroFunciona, nome, titulacao);
		this.totalHorasSemanais = totalHorasSemanais;
		this.valorHoraAula = valorHoraAula;
	}
	
	int getTotalHorasSemanais() {
		return this.totalHorasSemanais;
	}
	
	double getValorHoraAula() {
		return this.valorHoraAula;
	}
	
	public void setTotalHorasSemanais(int totalHorasSemanais) {
		this.totalHorasSemanais = totalHorasSemanais;
	}
	
	public void setTValorHoraAula(double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}
	
	@Override
	public double calcularSalario() {
		double remumensal = (totalHorasSemanais * valorHoraAula * 4.5) * 0.1666;
		return remumensal;
	}
}
