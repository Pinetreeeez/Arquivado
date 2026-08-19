package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
     
        float quilometro, combustivel, consumo;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe a distância percorrida em quilômetros: ");
        quilometro = ler.nextFloat();
        
        System.out.println("Informe o total de combustível gasto: ");
        combustivel = ler.nextFloat();
        
        consumo = quilometro / combustivel;
        
        System.out.println("O consumo médio do veiculo foi: R$" + consumo);
    }
    
}
    
    

