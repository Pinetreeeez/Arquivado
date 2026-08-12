package ex6;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        int x, z;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite um numero inteiro: ");
        x = ler.nextInt();
        
        z = x * 2;
        
        System.out.println("O dobro de seu numero: " + z);
    }
    
}
