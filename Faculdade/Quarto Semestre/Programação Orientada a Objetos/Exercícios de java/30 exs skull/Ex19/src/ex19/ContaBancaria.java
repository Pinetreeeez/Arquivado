package ex19;

public class ContaBancaria {
	private String numeroConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(String numeroConta,String titular,double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	String getNumeroConta(){
		return this.numeroConta;
	}
	
	String getTitular() {
		return this.titular;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	void setTitular(String titular) {
		this.titular = titular;
	}
	
	void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Erro! O valor do depósito deve ser maior que zero.");
			return;
		}
		this.saldo += valor;
		System.out.println("Saldo depositado com sucesso!");
	}
	
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Erro! O valor do saque deve ser menor ou igual ao saldo guardado");
			return;
		}
		
		if (getSaldo() < valor) {
			System.out.println("Erro! Saldo insuficiente para o valor cobrado!");
		}
		else {this.saldo -= valor;
			  System.out.println("Sucesso! Valor sacado!");}
	}
	
	double consultarSaldo() {
		return this.saldo;
	}
}
