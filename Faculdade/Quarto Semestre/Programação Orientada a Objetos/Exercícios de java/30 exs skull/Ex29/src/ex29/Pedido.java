package ex29;

public class Pedido {
	private int numeroPedido;
	private String descricaoItens;
	private double subtotal;
	private String status;
	
	public Pedido(int numeroPedido, String descricaoItens, double subtotal, String status) {
		this.numeroPedido = numeroPedido;
		this.descricaoItens = descricaoItens;
		this.subtotal = subtotal;
		this.status = status;
	}
	
	int getNumeroPedido() {
		return this.numeroPedido;
	}
	
	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	String getDescricaoItens() {
		return this.descricaoItens;
	}
	
	public void setDescricaoItens(String descricaoItens) {
		this.descricaoItens = descricaoItens;
	}
	
	double getSubtotal() {
		return this.subtotal;
	}
	
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	
	String getStatus() {
		return this.status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	double calcularTotalFinal() {
		return this.subtotal;
	}
	
	public void atualizarStatus(String novoStatus) {
		this.status = novoStatus;
	}
}
