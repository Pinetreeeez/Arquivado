package ex29;

public class PedidoDelivery extends Pedido{
	private String enderecoEntrega;
	private double distanciaKM;
	private double taxaPorKM;
	
	public PedidoDelivery(int numeroPedido, String descricaoItens, double subtotal, String status, String enderecoEntrega, double distanciaKM, double taxaPorKM) {
		super(numeroPedido, descricaoItens, subtotal, status);
		this.enderecoEntrega = enderecoEntrega;
		this.distanciaKM = distanciaKM;
		this.taxaPorKM = taxaPorKM;
	}
	
	String getEnderecoEntrega() {
		return this.enderecoEntrega;
	}
	
	void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	double getDistanciaKM() {
		return this.distanciaKM;
	}
	
	public void setDistanciaKM(double distanciaKM) {
		this.distanciaKM = distanciaKM;
	}
	
	double getTaxaPorKM() {
		return this.taxaPorKM;
	}
	
	public void setTaxaPorKM(double taxaPorKM) {
		this.taxaPorKM = taxaPorKM;
	}
	
	@Override
	public double calcularTotalFinal() {
		return getSubtotal() + (this.distanciaKM * this.taxaPorKM);
	}
}
