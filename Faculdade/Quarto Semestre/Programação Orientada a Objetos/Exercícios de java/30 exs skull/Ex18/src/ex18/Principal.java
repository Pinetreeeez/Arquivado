package ex18;

public class Principal {

	public static void main(String[] args) {
		
				Carro meuCarro = new Carro("Toyota", "Corolla", 2022, 60.0, 4, true);
				
				Moto minhaMoto = new Moto("Yamaha", "MT-07", 2023, 20.0, 689, true);
			
				System.out.println(System.lineSeparator() + "=== DADOS DO CARRO ==="+System.lineSeparator());
				System.out.println("Marca: " + meuCarro.getMarca_veiculo());
				System.out.println("Modelo: " + meuCarro.getModelo_veiculo());
				System.out.println("Ano: " + meuCarro.getanoFabricacao());
				System.out.println("Portas: " + meuCarro.getQuantidadePortas());
				System.out.println("Ar condicionado ligado? " + meuCarro.getarCondicionadoLigado());
				
				System.out.println("Velocidade atual: " + meuCarro.getvelocidadeAtual() + " km/h");
				meuCarro.Acelerar_veiculo();
				System.out.println("Velocidade após acelerar: " + meuCarro.getvelocidadeAtual() + " km/h");

				System.out.println(System.lineSeparator() + "=== DADOS DA MOTO ===" +System.lineSeparator());
				System.out.println("Marca: " + minhaMoto.getMarca_veiculo());
				System.out.println("Modelo: " + minhaMoto.getModelo_veiculo());
				System.out.println("Ano: " + minhaMoto.getanoFabricacao());
				System.out.println("Cilindradas: " + minhaMoto.getCilindradas());
				System.out.println("Partida elétrica? " + minhaMoto.getPartidaEletrica());
				
				System.out.println("Velocidade atual: " + minhaMoto.getvelocidadeAtual() + " km/h");
				minhaMoto.Frear_veiculo();
				System.out.println("Velocidade após frear: " + minhaMoto.getvelocidadeAtual() + " km/h");
				
				minhaMoto.Empinar(minhaMoto.velocidadeAtual);
				

	}

}
