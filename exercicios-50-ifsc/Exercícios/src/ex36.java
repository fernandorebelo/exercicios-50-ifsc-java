import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		/*
		 * pedir pra ler 5 números
		 * exibis quantos números são pares
		 */
		
		int numero;
		int quantidade = 0;
		
		Scanner in = new Scanner(System.in);

		for(int i = 1; i <= 5; i++) {
			System.out.println("Digite um número: ");
			numero = Integer.parseInt(in.nextLine());
			
			if(numero % 2 == 0) {
				quantidade++;
			}
		}
		
		System.out.println("A quantidade de números pares é: " + quantidade);
	}

}
