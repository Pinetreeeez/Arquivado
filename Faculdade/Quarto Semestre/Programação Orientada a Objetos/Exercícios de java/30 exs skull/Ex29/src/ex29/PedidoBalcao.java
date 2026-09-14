package ex29;

public class PedidoBalcao extends Pedido {
	private String nomeClienteRetirada;
	private double percentualDescontoRetirada;
	
	public PedidoBalcao(int numeroPedido, String descricaoItens, double subtotal, String status, String nomeClienteRetirada, double percentualDescontoRetirada) {
		super(numeroPedido, descricaoItens, subtotal, status);
		this.nomeClienteRetirada = nomeClienteRetirada;
		this.percentualDescontoRetirada = percentualDescontoRetirada;
	}
	
	String getNomeClienteRetirada() {
		return this.nomeClienteRetirada;
	}
	
	public void setNomeClienteRetirada(String nomeClienteRetirada) {
		this.nomeClienteRetirada = nomeClienteRetirada;
	}
	
	double getPercentualDescontoRetirada() {
		return this.percentualDescontoRetirada;
	}
	
	public void setPercentualDescontoRetirada(double percentualDescontoRetirada) {
		this.percentualDescontoRetirada = percentualDescontoRetirada;
	}
	
	@Override
	public double calcularTotalFinal() {
		return getSubtotal() - (getSubtotal() * (this.percentualDescontoRetirada / 100.0));
	}
}
