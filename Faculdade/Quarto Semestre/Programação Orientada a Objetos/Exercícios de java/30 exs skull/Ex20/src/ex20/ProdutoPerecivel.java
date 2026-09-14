package ex20;

public class ProdutoPerecivel extends Produto {
	private int diasParaVencer;
	
	public ProdutoPerecivel(int codigo, String descricao, double precoCusto, double margemLucro, int diasParaVencer) {
		super (codigo, descricao, precoCusto, margemLucro);
		this.diasParaVencer = diasParaVencer;
	}
	
	int getDiasParaVencer() {
		return this.diasParaVencer;
	}
	
	public void setDiasParaVencer(int diasParaVencer) {
		this.diasParaVencer = diasParaVencer;
	}
	
	@Override
	public double calcularPrecoVenda() {
		if(diasParaVencer <= 5) {
			return getPrecoCusto() + (getPrecoCusto() * getMargemLucro() / 100) * (20/100);
		}
		else {return getPrecoCusto() + (getPrecoCusto() * getMargemLucro() / 100);
		}
	}
}
