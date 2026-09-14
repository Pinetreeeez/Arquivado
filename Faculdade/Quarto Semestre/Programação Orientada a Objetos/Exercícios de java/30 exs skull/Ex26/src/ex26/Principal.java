package ex26;

public class Principal {
	public static void main(String[] args) {
		
		Smartphone smartphone = new Smartphone("Apple", "iPhone 13", true, 85, "Claro", 128);

		Notebook notebook = new Notebook("Dell", "XPS 15", true, 90, 16, "Intel i7");

		System.out.println("Fabricante: " + smartphone.getFrabricante());

		System.out.println("Modelo: " + smartphone.getModelo());

		System.out.println("Ligado: " + smartphone.getLigado());

		System.out.println("Bateria: " + smartphone.getNivelBateria() + "%");

		System.out.println("Operadora: " + smartphone.getOperadora());

		System.out.println("Armazenamento: " + smartphone.getArmazenamentoGB() + " GB");

		smartphone.fazerLigacao("11999999999"+ System.lineSeparator());

		System.out.println("Bateria após ligação: " + smartphone.getNivelBateria() + "%"+ System.lineSeparator());
		
		smartphone.Desligar();
		System.out.println("Ligado: " + smartphone.getLigado()+ System.lineSeparator());
		smartphone.Ligar();
		System.out.println("Ligado: " + smartphone.getLigado()+ System.lineSeparator());

		System.out.println("Fabricante: " + notebook.getFrabricante());

		System.out.println("Modelo: " + notebook.getModelo());

		System.out.println("Ligado: " + notebook.getLigado());

		System.out.println("Bateria: " + notebook.getNivelBateria() + "%");

		System.out.println("Memória RAM: " + notebook.getMemoriaRAM() + " GB");

		System.out.println("Processador: " + notebook.getProcessador()+ System.lineSeparator());

		notebook.executarProcessamentoPesado();

		System.out.println("Bateria após processamento: " + notebook.getNivelBateria() + "%"+ System.lineSeparator());
		
		notebook.Desligar();
		System.out.println("Ligado: " + notebook.getLigado()+ System.lineSeparator());
	}
}
