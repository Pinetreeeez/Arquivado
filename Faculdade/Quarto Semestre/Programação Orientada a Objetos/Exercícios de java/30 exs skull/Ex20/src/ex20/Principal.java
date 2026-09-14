package ex20;

public class Principal {

	public static void main(String[] args) {
		
		Produto produto = new Produto(101, "Camiseta", 50.0, 40.0);

		System.out.println("Código: " + produto.getCodigo());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Preço de Custo: R$ " + produto.getPrecoCusto());
		System.out.println("Margem de Lucro: " + produto.getMargemLucro() + "%");
		System.out.println("Preço de Venda: R$ " + produto.calcularPrecoVenda() + System.lineSeparator());

		produto.setPrecoCusto(60.0);
		produto.setMargemLucro(50.0);
		System.out.println("Novo Preço de Custo: R$ " + produto.getPrecoCusto());
		System.out.println("Nova Margem de Lucro: " + produto.getMargemLucro() + "%");
		System.out.println("Novo Preço de Venda: R$ " + produto.calcularPrecoVenda()+ System.lineSeparator());

		ProdutoPerecivel produtoperecivel = new ProdutoPerecivel(201, "Queijo", 20.0, 30.0, 10);

		System.out.println("Código: " + produtoperecivel.getCodigo());
		System.out.println("Descrição: " + produtoperecivel.getDescricao());
		System.out.println("Preço de Custo: R$ " + produtoperecivel.getPrecoCusto());
		System.out.println("Margem de Lucro: " + produtoperecivel.getMargemLucro() + "%");
		System.out.println("Dias para vencer: " + produtoperecivel.getDiasParaVencer());
		System.out.println("Preço de Venda: R$ " + produtoperecivel.calcularPrecoVenda()+ System.lineSeparator());

		ProdutoPerecivel produtoperecivel2 = new ProdutoPerecivel(202, "Leite", 5.0, 20.0, 3);

		System.out.println("Código: " + produtoperecivel2.getCodigo());
		System.out.println("Descrição: " + produtoperecivel2.getDescricao());
		System.out.println("Preço de Custo: R$ " + produtoperecivel2.getPrecoCusto());
		System.out.println("Margem de Lucro: " + produtoperecivel2.getMargemLucro() + "%");
		System.out.println("Dias para vencer: " + produtoperecivel2.getDiasParaVencer());
		System.out.println("Preço de Venda: R$ " + produtoperecivel2.calcularPrecoVenda());
	}

}
