import java.util.Scanner;

public class ex32 {

	public static void main(String[] args) {
		/*
		 * solicitar 10 n�meros ao usu�rio e somar todos
		 * usar for
		 */
		Scanner in = new Scanner(System.in);
		
		int soma = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " - Digite um n�mero: ");
			int numero = Integer.parseInt(in.nextLine());
			soma += numero;
		}
		System.out.println("A soma �: " + soma);
	}

}
