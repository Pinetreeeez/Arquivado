package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
       float comprimento, largura, precocarpete, precototal;
       
       Scanner ler = new Scanner (System.in);
       
       System.out.println("Informe o comprimento da sala: ");
       comprimento = ler.nextFloat();
       
       System.out.println("Informe a largura da sala");
       largura = ler.nextFloat();
       
       System.out.println("Informe o preço do metro quadrado de carpete");
       precocarpete = ler.nextFloat();
       
       precototal = (comprimento * largura) * (precocarpete * precocarpete);
       System.out.println("O custo total para forrar o piso da sala é: R$" + precototal);
       
    }
    
}
