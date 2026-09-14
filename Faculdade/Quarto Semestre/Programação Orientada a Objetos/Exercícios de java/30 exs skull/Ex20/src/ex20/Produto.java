package ex20;

public class Produto {
	private int codigo;
	private String descricao;
	private double precoCusto;
	private double margemLucro;
	
	public Produto(int codigo, String descricao, double precoCusto, double margemLucro) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoCusto = precoCusto;
		this.margemLucro = margemLucro;
	}
	
	int getCodigo() {
		return this.codigo;
	}
	
	String getDescricao() {
		return this.descricao;
	}
	
	double getPrecoCusto() {
		return this.precoCusto;
	}
	
	double getMargemLucro() {
		return this.margemLucro;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	public void setMargemLucro(double margemLucro) {
		this.margemLucro = margemLucro;
	}
	
	public double calcularPrecoVenda() {
		return precoCusto + (precoCusto * margemLucro / 100);
	}
}
