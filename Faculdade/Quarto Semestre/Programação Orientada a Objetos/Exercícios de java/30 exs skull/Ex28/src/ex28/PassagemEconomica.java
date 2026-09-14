package ex28;

public class PassagemEconomica extends Passagem{
	private int quantMalasDespachadas;
	
	public PassagemEconomica(String codigoBilhete, String origem, String destino, double tarifaBase, int quantMalasDespachadas) {
		super (codigoBilhete, origem, destino, tarifaBase);
		this.quantMalasDespachadas = quantMalasDespachadas;
	}
	
	int getQuantMalasDespachadas() {
		return this.quantMalasDespachadas;
	}
	
	public void setquantMalasDespachadas(int quantMalasDespachadas) {
		this.quantMalasDespachadas = quantMalasDespachadas;
	}
	
	@Override
	public double calcularValorTotal() {
		double taxamalas = this.quantMalasDespachadas * 140.00;
		return super.calcularValorTotal() + taxamalas;
	}
}
