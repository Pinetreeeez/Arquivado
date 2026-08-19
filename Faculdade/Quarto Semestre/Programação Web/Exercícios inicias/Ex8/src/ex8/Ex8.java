package ex8;

import java.util.Scanner;

public class Ex8 {
    
    public static void main(String[] args) {
        float x, y, z;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o numero: ");
        x = ler.nextFloat();
        
        System.out.println("Digite a porcentagem: ");
        y = ler.nextFloat();
        
        z = x * (y /100);
        System.out.println("A porcentagem desse numero é: " + z);
        
    }
    
}
