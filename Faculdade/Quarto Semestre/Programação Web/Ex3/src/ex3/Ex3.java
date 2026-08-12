package ex3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        float peso, altura, imc;
        
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Informe o peso em quilogramas da pessoa: ");
        peso = ler.nextFloat();
        
        System.out.println("Informe a altura em metros da pessoas: ");
        altura = ler.nextFloat();
        
        imc = peso / (altura * altura);
        
        System.out.println("O valor de seu IMC é: " + imc);
        
    }
    
}
