package ex27;

public class Mago extends Personagem {
	private int pontosMana;
	private int poderMagico;
	
	public Mago(String nome, int pontosVida, int nivel, int forcaBase, int pontosMana, int poderMagico) {
		super(nome,pontosVida,nivel,forcaBase);
		this.pontosMana = pontosMana;
		this.poderMagico = poderMagico;
	}
	
	int getPontosMana() {
		return this.pontosMana;
	}
	
	public void setPontosMana(int pontosMana) {
		this.pontosMana = pontosMana;
	}
	
	int getPoderMagico() {
		return this.poderMagico;
	}
	
	public void setPoderMagico(int poderMagico) {
		this.poderMagico = poderMagico;
	}
	
	public void lancarMagia(Personagem alvo) {
		int customana = 15;
		if (this.pontosMana >= customana) {
			this.pontosMana -= customana;
			int danomagico = getForcaBase() * this.poderMagico;
			System.out.println(" [Mago] " + getNome() + " lança uma magia em " + alvo.getNome() + " gastando " + customana + " de mana. ");
			alvo.receberDano(danomagico);
		}
		else {
			System.out.println(" [Mago] " + this.getNome() + " não tem mana suficiente para lançar magia! Mana atual: " + this.pontosMana);
		}
	}
}
