package ex22;

public class ImovelNovo extends Imovel {
	private double adicionalValorizacao;
	
	public ImovelNovo(int codigo, String endereco, double precoBase, double adicionalValorizacao) {
		super (codigo, endereco, precoBase);
		this.adicionalValorizacao = adicionalValorizacao;
	}
	
	double getAdicionalValorizacao() {
		return this.adicionalValorizacao;
	}
	
	public void setAdicionalValorizacao(double adicionalValorizacao) {
		this.adicionalValorizacao = adicionalValorizacao;
	}
	
	@Override
	public double obterPrecoFinal() {
		return getPrecoBase() + adicionalValorizacao;
	}
}
