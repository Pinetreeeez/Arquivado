package ex27;

public class Guerreiro extends Personagem{
	private int armadura;
	private boolean temEscudo;
	
	public Guerreiro(String nome, int pontosVida, int nivel, int forcaBase, int armadura, boolean temEscudo) {
		super(nome,pontosVida,nivel,forcaBase);
		this.armadura = armadura;
		this.temEscudo = temEscudo;
	}
	
	int getArmadura() {
		return this.armadura;
	}
	
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	
	boolean getTemEscudo() {
		return this.temEscudo;
	}
	
	public void setTemEscudo(boolean temEscudo) {
		this.temEscudo = temEscudo;
	}
	
	public void porEscudo() {
		if (temEscudo == false) {
			setTemEscudo(temEscudo = true);
			System.out.println("O personagem equipou um escudo!");
		}
		
		else{
			System.out.println("O personagem já tem um escudo!");
		}
	}
	
	public void removerEscudo() {
		if (temEscudo == true) {
			setTemEscudo(temEscudo = false);
			System.out.println("O personagem desequipou seu escudo!");
		}
		else { 
			System.out.println("O personagem não tem algum escudo equipado");
		}
	}
	
	@Override
	public void receberDano(int dano) {
		int bloqueio = dano - this.armadura ;
		if (bloqueio < 0) bloqueio = 0;
		System.out.println(" [Guerreiro] " + this.getNome() + " reduziu o dano com sua armadura ");
		super.receberDano(bloqueio);
	}
}
