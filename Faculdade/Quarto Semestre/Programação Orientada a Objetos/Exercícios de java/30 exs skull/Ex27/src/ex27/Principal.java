package ex27;

public class Principal {
	public static void main(String[] args) {
		Guerreiro guerreiro = new Guerreiro("Thorin", 100, 5, 20, 5, false);

		Mago mago = new Mago("Gandalf", 70, 5, 10, 50, 3);

		System.out.println("=== GUERREIRO ===");

		System.out.println("Nome: " + guerreiro.getNome());

		System.out.println("Pontos de Vida: " + guerreiro.getPontosVida());

		System.out.println("Nível: " + guerreiro.getNivel());

		System.out.println("Força Base: " + guerreiro.getForcaBase());

		System.out.println("Armadura: " + guerreiro.getArmadura());

		System.out.println("Tem Escudo: " + guerreiro.getTemEscudo());

		guerreiro.porEscudo();

		System.out.println();

		System.out.println("=== MAGO ===");

		System.out.println("Nome: " + mago.getNome());

		System.out.println("Pontos de Vida: " + mago.getPontosVida());

		System.out.println("Nível: " + mago.getNivel());

		System.out.println("Força Base: " + mago.getForcaBase());

		System.out.println("Pontos de Mana: " + mago.getPontosMana());

		System.out.println("Poder Mágico: " + mago.getPoderMagico());

		System.out.println();

		System.out.println("=== COMBATE ===");

		guerreiro.atacar(mago);

		System.out.println();

		mago.lancarMagia(guerreiro);
	}
}
