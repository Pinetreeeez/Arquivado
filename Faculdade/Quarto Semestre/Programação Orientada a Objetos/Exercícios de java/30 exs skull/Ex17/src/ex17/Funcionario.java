package ex17;

public class Funcionario {
	private int matricula;
    private String nome;
    protected double salarioBase;
    
    
    public Funcionario(int matricula, String nome, double salarioBase) {
        this.matricula = matricula;
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    
    public int getMatricula(){
        return this.matricula;
    }

    
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    
    public double calcularSalarioLiquido(double salarioBase){
        return (salarioBase * 0.89);
    }
   
    
}

