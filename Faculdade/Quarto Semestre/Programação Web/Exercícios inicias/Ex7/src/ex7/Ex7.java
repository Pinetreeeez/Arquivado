package ex7;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        String nome; float valor, valorfinal, valordps, desconto;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe o nome do produto: ");
        nome = ler.nextLine();
        
        System.out.println("Digite o valor desse produto: ");
        valor = ler.nextFloat();
        
        System.out.println("Digite o desconto desse produto: ");
        desconto = ler.nextFloat();
        
        valordps = valor * (desconto /100);
        valorfinal = valor - valordps;
        
        System.out.println("Produto: " + nome + System.lineSeparator() + "Valor do desconto: %" + desconto + System.lineSeparator() + "Valor final do produto: R$" + valorfinal);
    }
    
}
