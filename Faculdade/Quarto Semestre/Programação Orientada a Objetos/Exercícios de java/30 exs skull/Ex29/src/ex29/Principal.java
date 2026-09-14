package ex29;

public class Principal {

	public static void main(String[] args) {
		PedidoBalcao pedidoBalcao = new PedidoBalcao(1, "2x Hambúrguer, 1x Refri", 80.0, "Pronto para Retirada", "João", 10.0);

		PedidoDelivery pedidoDelivery = new PedidoDelivery(2, "1x Pizza G, 1x Suco", 100.0, "Em Rota", "Rua das Flores, 123", 5.5, 2.0);
		
		System.out.println("=== PEDIDO BALCÃO ===");
		System.out.println("N° Pedido: " + pedidoBalcao.getNumeroPedido());
		System.out.println("Itens: " + pedidoBalcao.getDescricaoItens());
		System.out.println("Subtotal: R$ " + pedidoBalcao.getSubtotal());
		System.out.println("Cliente: " + pedidoBalcao.getNomeClienteRetirada());
		System.out.println("Total Final (10% desc): R$ " + pedidoBalcao.calcularTotalFinal());
		
		System.out.println();
		
		System.out.println("=== PEDIDO DELIVERY ===");
		System.out.println("N° Pedido: " + pedidoDelivery.getNumeroPedido());
		System.out.println("Itens: " + pedidoDelivery.getDescricaoItens());
		System.out.println("Subtotal: R$ " + pedidoDelivery.getSubtotal());
		System.out.println("Endereço: " + pedidoDelivery.getEnderecoEntrega());
		System.out.println("Total Final (Subtotal + Frete): R$ " + pedidoDelivery.calcularTotalFinal());

	}

}
