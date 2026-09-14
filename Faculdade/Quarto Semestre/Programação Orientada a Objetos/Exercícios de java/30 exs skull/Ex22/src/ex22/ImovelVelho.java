package ex22;

public class ImovelVelho extends Imovel{
	private double descontoDepreciacao;
	
	public ImovelVelho(int codigo, String endereco, double precoBase, double descontoDepreciacao) {
		super (codigo, endereco, precoBase);
		this.descontoDepreciacao = descontoDepreciacao;
	}
	
	double getDescontoDepreciacao() {
		return this.descontoDepreciacao;
	}
	
	public void setDescontoDepreciacao(double descontoDepreciacao) {
		this.descontoDepreciacao = descontoDepreciacao;
	}
	
	@Override
	public double obterPrecoFinal() {
		return getPrecoBase() - descontoDepreciacao;
	}
}
