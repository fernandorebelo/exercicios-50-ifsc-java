import java.util.Scanner;

public class ex41 {

	public static void main(String[] args) {
		/*
		 * simulador de caixa de supermercado
		 * receber informa��o de quantos produtos o cliente comprou
		 * para cada produto dever� ler o pre�o
		 * ao final informar o valor total das compras
		 */
		Scanner in = new Scanner(System.in);
		
		double quantidadeProdutos, precoUnidade, precoTotal = 0;
		
		System.out.println("Quantos produtos comprados?");
		quantidadeProdutos = Integer.parseInt(in.nextLine());
		
		for(int i = 1; i <= quantidadeProdutos; i++) {
			System.out.println("Qual o valor do produto " + i + "?");
			precoUnidade = Integer.parseInt(in.nextLine());
			
			precoTotal += precoUnidade;
		}
		System.out.println("O pre�o total das compras foi de R$" + precoTotal);
	}

}
