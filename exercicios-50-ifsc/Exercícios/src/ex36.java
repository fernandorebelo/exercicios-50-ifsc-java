import java.util.Scanner;

public class ex36 {

	public static void main(String[] args) {
		/*
		 * pedir pra ler 5 n�meros
		 * exibis quantos n�meros s�o pares
		 */
		
		int numero;
		int quantidade = 0;
		
		Scanner in = new Scanner(System.in);

		for(int i = 1; i <= 5; i++) {
			System.out.println("Digite um n�mero: ");
			numero = Integer.parseInt(in.nextLine());
			
			if(numero % 2 == 0) {
				quantidade++;
			}
		}
		
		System.out.println("A quantidade de n�meros pares �: " + quantidade);
	}

}
