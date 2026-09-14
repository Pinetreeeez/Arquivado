package ex19;

public class ContaPoupanca extends ContaBancaria {
	private double taxaRendimento;
	
	public ContaPoupanca(String numeroConta,String titular,double saldo, double taxaRendimento) {
		super (numeroConta, titular, saldo);
		this.taxaRendimento = taxaRendimento;
	}
	
	public double getTaxaRendimento() {
		return this.taxaRendimento;
	}
	
	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}
	
	public void aplicarRendimento() {
		setSaldo(getSaldo() + (taxaRendimento /100));
	}
	
}
