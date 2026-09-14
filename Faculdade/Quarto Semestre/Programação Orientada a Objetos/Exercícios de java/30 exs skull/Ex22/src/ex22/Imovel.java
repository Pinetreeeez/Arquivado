package ex22;

public class Imovel {
	private int codigo;
	private String endereco;
	private double precoBase;
	
	public Imovel(int codigo, String endereco, double precoBase) {
		this.codigo = codigo;
		this.endereco = endereco;
		this.precoBase = precoBase;
	}
	
	int getCodigo() {
		return this.codigo;
	}
	
	String getEndereco() {
		return this.endereco;
	}
	
	double getPrecoBase() {
		return this.precoBase;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	
	public double obterPrecoFinal() {
		return precoBase;
	}
}
