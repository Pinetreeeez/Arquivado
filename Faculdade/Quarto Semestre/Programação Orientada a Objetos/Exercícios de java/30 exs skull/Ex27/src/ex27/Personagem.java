package ex27;

public class Personagem {
	private String nome;
	private int pontosVida;
	private int nivel;
	private int forcaBase;
	
	public Personagem(String nome, int pontosVida, int nivel, int forcaBase) {
		this.nome = nome;
		this.pontosVida = pontosVida;
		this.nivel = nivel;
		this.forcaBase = forcaBase;
	}
	
	String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	int getPontosVida() {
		return this.pontosVida;
	}
	
	public void setPontosVida(int pontosVida) {
		this.pontosVida = pontosVida;
	}
	
	int getNivel() {
		return this.nivel;
	}
	
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	int getForcaBase() {
		return this.forcaBase;
	}
	
	public void setForcaBase(int forcaBase) {
		this.forcaBase = forcaBase;
	}
	
	public void receberDano(int dano) {
		this.pontosVida -= dano;
		if(this.pontosVida < 0) this.pontosVida = 0;
		System.out.println(this.nome + " recebeu: " + dano + " de dano e ficou com: " + this.pontosVida + " de vida. ");
	}
	
	public void atacar(Personagem alvo) {
		System.out.println(this.nome + " ataca " + alvo.getNome() + " causando " + this.forcaBase + " de dano físico. ");
		alvo.receberDano(this.forcaBase);
	}
}
