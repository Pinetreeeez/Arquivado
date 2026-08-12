package ex4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        float c, j, f; int m;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe a sua capital: ");
        c = ler.nextFloat();
        
        System.out.println("Informe uma taxa de juros mensal: ");
        j = ler.nextFloat();
        
        System.out.println("Informe o período de aplicação: ");
        m = ler.nextInt();
        
        f = c * ((1 + j / 100) * m);
        
        System.out.println("O seu final de periodo sera: " + f);
    }
    
}
