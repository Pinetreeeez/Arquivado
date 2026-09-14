package ex28;

public class Principal {
	public static void main(String[] args) {
	
	Passagem passagembase = new Passagem("BIL-001", "São Paulo", "Rio de Janeiro", 300.0);

	PassagemEconomica passagemeco = new PassagemEconomica("BIL-002", "São Paulo", "Salvador", 500.0, 2);

	PassagemExecutiva passagemex = new PassagemExecutiva("BIL-003", "São Paulo", "Nova York", 3000.0, true, true);

	System.out.println("=== PASSAGEM BASE ===");

	System.out.println("Bilhete: " + passagembase.getCodigoBilhete());

	System.out.println("Origem: " + passagembase.getOrigem());

	System.out.println("Destino: " + passagembase.getDestino());

	System.out.println("Tarifa Base: R$ " + passagembase.getTarifaBase());

	System.out.println("Valor Total: R$ " + passagembase.calcularValorTotal());

	System.out.println();

	System.out.println("=== PASSAGEM ECONÔMICA ===");

	System.out.println("Bilhete: " + passagemeco.getCodigoBilhete());

	System.out.println("Origem: " + passagemeco.getOrigem());

	System.out.println("Destino: " + passagemeco.getDestino());

	System.out.println("Tarifa Base: R$ " + passagemeco.getTarifaBase());

	System.out.println("Malas Despachadas: " + passagemeco.getQuantMalasDespachadas());

	System.out.println("Valor Total: R$ " + passagemeco.calcularValorTotal());

	System.out.println();

	System.out.println("=== PASSAGEM EXECUTIVA ===");

	System.out.println("Bilhete: " + passagemex.getCodigoBilhete());

	System.out.println("Origem: " + passagemex.getOrigem());

	System.out.println("Destino: " + passagemex.getDestino());

	System.out.println("Tarifa Base: R$ " + passagemex.getTarifaBase());

	System.out.println("Acesso Lounge VIP: " + passagemex.isAcessoLoungeVIP());

	System.out.println("Serviço de Bordo Premium: " + passagemex.isServicoBordoPremium());

	System.out.println("Valor Total: R$ " + passagemex.calcularValorTotal());

	}
}
