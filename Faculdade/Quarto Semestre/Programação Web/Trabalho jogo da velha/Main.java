package teste;

public class Main {

	public static void main(String[] args) {
		
		// esse char [] [] é uma matriz (também conhecido como um array bidimensional que é uma estrutura de dados que organiza valores em linhas e colunas, formando uma tabela ou grade. 
		char [][] tabuleiro = {
				{' ', '|', ' ', '|', ' '},
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '},          //design top :heart:
				{'-', '+', '-', '+', '-'},
				{' ', '|', ' ', '|', ' '}};
		
		printTabuleiro(tabuleiro);                 //chama a função do printTabuleiro que pega matriz como argumento, e o tabuleiro é uma matriz.
	}
	
	public static void printTabuleiro(char[][] tabuleiro) {    //Ele faz duas iterações, a primeira é a de cada linha dentro do tabuleiro e no segundo ele pega cada simbolo dentro dessa linha
		for (char[] linha : tabuleiro) {
			for(char coluna : linha) {
				System.out.print(coluna);                     //Ele faz print do negócio inteiro sem pular linhas
			}
			System.out.println();                             //Aqui ele vai printar 5 vezes, separando em linhas dando o formato do jogo da velha
		
		}
	}
}