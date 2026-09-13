package ex17;

public class Principal_Funcionario_Gerente {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario(1, "MARCOS ANTONIO ESTREMOTE", 3557.60);

        double salarioL = funcionario.calcularSalarioLiquido(funcionario.getSalarioBase());

        System.out.println("Matricula: "+funcionario.getMatricula());
        System.out.println("Nome:" + funcionario.getNome());
        System.out.println("Salario Base: "+ funcionario.getSalarioBase() );
        System.out.printf("Salario Liquido:  %.2f%n", salarioL);



        System.out.println(System.lineSeparator()+"***************G E R E N T E*********************" + System.lineSeparator());
        Gerente gerente = new Gerente(2, "CRISTIANO PIRES MARTINS", 35000.00, 30, "ADS");

        System.out.println("Matricula Gerente: "+gerente.getMatricula());
        System.out.println("Nome Gerente: "+gerente.getNome());
        System.out.printf("Salario Base: R$ %.2f\n", gerente.getSalarioBase());
        System.out.printf("Bonus: %.2f \n", gerente.getBonusGerencia());
        System.out.printf("Salario Liquido R$ %.2f \n", gerente.calcularSalarioLiquido(gerente.getSalarioBase()));

	}

}
