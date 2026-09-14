package ex22;

public class Principal {

	public static void main(String[] args) {
		Imovel imovelnormal = new Imovel(1, "Rua das Flores, 123", 250000.0);

		ImovelNovo imovelnovo = new ImovelNovo(2, "Av. Paulista, 1000", 500000.0, 50000.0);

		ImovelVelho imovelvelho = new ImovelVelho(3, "Rua XV de Novembro, 45", 180000.0, 20000.0);

		System.out.println("Código: " + imovelnormal.getCodigo());

		System.out.println("Endereço: " + imovelnormal.getEndereco());

		System.out.println("Preço Base: R$ " + imovelnormal.getPrecoBase());

		System.out.println("Preço Final: R$ " + imovelnormal.obterPrecoFinal() + System.lineSeparator());


		System.out.println("Código: " + imovelnovo.getCodigo());

		System.out.println("Endereço: " + imovelnovo.getEndereco());

		System.out.println("Preço Base: R$ " + imovelnovo.getPrecoBase());

		System.out.println("Adicional de Valorização: R$ " + imovelnovo.getAdicionalValorizacao());

		System.out.println("Preço Final: R$ " + imovelnovo.obterPrecoFinal()+ System.lineSeparator());


		System.out.println("Código: " + imovelvelho.getCodigo());

		System.out.println("Endereço: " + imovelvelho.getEndereco());

		System.out.println("Preço Base: R$ " + imovelvelho.getPrecoBase());

		System.out.println("Desconto de Depreciação: R$ " + imovelvelho.getDescontoDepreciacao());

		System.out.println("Preço Final: R$ " + imovelvelho.obterPrecoFinal()+ System.lineSeparator());

	}

}
