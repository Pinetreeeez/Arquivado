package ex17;

public class Gerente extends Funcionario{

	   private double bonusGerencia;
	   private String departamento;
	  
	  
	   public Gerente(int matricula, String nome, double salarioBase, double bonusGerencia, String departamento) {
	    super(matricula, nome, salarioBase); 
	    this.bonusGerencia = bonusGerencia;
	    this.departamento = departamento;
	   }


	   public double getBonusGerencia() {
	    return bonusGerencia;
	   }


	   public void setBonusGerencia(double bonusGerencia) {
	    this.bonusGerencia = bonusGerencia;
	   }


	   public String getDepartamento() {
	    return departamento;
	   }


	   public void setDepartamento(String departamento) {
	    this.departamento = departamento;
	   }


	   public double calcularSalarioLiquido(double salarioBase){
	        return (salarioBase * (1 + (this.getBonusGerencia()/100))) * 0.89; //Aqui o cálculo é diferente de Funcionário
	    }
	    
	}