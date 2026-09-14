package ex19;

public class Principal {

	public static void main(String[] args) {
		
				System.out.println("=== TESTE CONTA BANCÁRIA === \n");
				
				ContaBancaria contabanco = new ContaBancaria("1111", "João Silva", 1000.0);
				System.out.println("Saldo inicial: R$ " + contabanco.consultarSaldo());
				
				contabanco.depositar(200.0);
				
				System.out.print("Tentativa de saque de R$ 1500.0: ");
				contabanco.sacar(1500.0); 
				
				System.out.print("Tentativa de saque de R$ 500.0: ");
				contabanco.sacar(500.0); 
				
				System.out.println("Saldo final: R$ " + contabanco.consultarSaldo());
				
				
				System.out.println("\n=== TESTE CONTA CORRENTE ===\n");
				
				ContaCorrente contacorrente = new ContaCorrente("2222", "Maria Oliveira", 500.0, 300.0);
				
				System.out.println("Saldo inicial: R$ " + contacorrente.consultarSaldo());
				
				System.out.print("Tentativa de saque de R$ 700.0: ");
				contacorrente.sacar(700.0);
				
				System.out.println("Saldo após utilizar cheque especial: R$ " + contacorrente.consultarSaldo());
				
				System.out.print("Tentativa de saque de R$ 200.0: ");
				contacorrente.sacar(200.0); 
				
				
				System.out.println("\n=== TESTE CONTA POUPANÇA ===\n");
	
				ContaPoupanca contapoupanca = new ContaPoupanca("3333", "Carlos Souza", 2000.0, 25.5);
				
				System.out.println("Saldo inicial: R$ " + contapoupanca.consultarSaldo());
				
				contapoupanca.aplicarRendimento();
				System.out.println("Saldo após aplicar rendimento: R$ " + contapoupanca.consultarSaldo());
	}

}
