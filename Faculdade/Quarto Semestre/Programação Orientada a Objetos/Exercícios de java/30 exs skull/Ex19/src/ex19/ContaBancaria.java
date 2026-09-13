package ex19;

public class ContaBancaria {
	private String numeroConta;
	private String titular;
	private double saldo;
	
	String getNumeroConta()){
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
		this.saldo += valor;
		System.out.println("Saldo depositado com sucesso!");
	}
	
	public void sacar(double valor) {
		if (this.saldo < valor) {
			System.out.println("Erro");
		}
		else {this.saldo -= valor;
			  System.out.println("Sucesso! Valor sacado");}
	}
	
	double consultarSaldo() {
		return this.saldo;
	}
}
