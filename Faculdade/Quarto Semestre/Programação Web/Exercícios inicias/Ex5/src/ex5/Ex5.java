package ex5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        String nome; float salario, novosalario,reajuste, conta;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe o nome do funcionário: ");
        nome = ler.nextLine();
        
        System.out.println("Informe o salário desse funcionário: ");
        salario = ler.nextFloat();
        
        System.out.println("Informe o reajuste: ");
        reajuste = ler.nextInt();
        
        conta = salario * (reajuste/100);
        novosalario = salario + conta;
        
        System.out.println("Nome: "+ nome + System.lineSeparator() + "Novo salário: R$" + novosalario);
       
    }
    
}
