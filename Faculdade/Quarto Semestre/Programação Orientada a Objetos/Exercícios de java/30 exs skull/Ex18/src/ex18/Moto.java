package ex18;

public class Moto extends Veiculo {
	private int cilindradas;
	private boolean partidaEletrica;
	
	public Moto(String marca, String modelo, int anoFabricacao, double velocidadeAtual, int cilindradas, boolean partidaEletrica) {
		super(marca, modelo, anoFabricacao, velocidadeAtual);
		this.cilindradas = cilindradas;
		this.partidaEletrica = partidaEletrica;
	}
	
	int getCilindradas(){
		return this.cilindradas;
	}
	
	boolean getPartidaEletrica() {
		return this.partidaEletrica;
	}
	
	void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	void setarPartidaEletrica(boolean partidaEletrica) {
		this.partidaEletrica = partidaEletrica;
	}
	
	void Empinar(double velocidadeAtual) {
		if(velocidadeAtual < 5 || velocidadeAtual >25) {
			System.out.println("PERIGO! - Velocidade fora do intervalo de segurança! " + velocidadeAtual);
		} else {
			System.out.println("Velocidade esta dentro do intervalo de segurança! " + velocidadeAtual);
		}
	}
}
