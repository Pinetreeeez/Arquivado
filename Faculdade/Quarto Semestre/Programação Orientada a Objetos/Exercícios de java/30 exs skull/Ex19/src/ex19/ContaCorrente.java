package ex19;

public class ContaCorrente extends ContaBancaria{
	private double limiteChequeEspecial;
	
	
	public ContaCorrente(String numeroConta,String titular,double saldo, double limiteChequeEspecial){
		super (numeroConta ,titular ,saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public double getLimiteChequeEspecial() {
		return this.limiteChequeEspecial;
	}
	
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	@Override
	public void sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Erro! O valor do depósito deve ser maior que zero.");
			return;
		}
		
		if (valor > getSaldo()) {
			System.out.println("Erro! O valor do saque deve ser menor ou igual ao saldo guardado.");
			return;
		}
		
		if(valor <= (getSaldo() + limiteChequeEspecial)) {
			setSaldo(getSaldo() - valor);
			System.out.println("Saque feito com sucesso!");
		}
		else {
			System.out.println("Erro! Valor é maior que o limite!");
		}
	}
}
